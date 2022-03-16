package dao;

import entidade.Cadastro;
import entidade.Entrada_Usuario;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Entrada_UsuarioDaoImpl implements Entrada_UsuarioDao {

    private Connection conexao;
    private PreparedStatement prepararinstrucao;
    private ResultSet resultado;
    private Cadastro cadastro;
    private Entrada_Usuario entrada_Usuario;
    private Usuario usuario;

    @Override
     // INSERT PARA SALVAR NOVO LOGIN_ACESSO NO SISTEMA//
    public void salvar(Object object) throws Exception {

        Entrada_Usuario entrada_usuario = (Entrada_Usuario) object;
        String instrucao = "INSERT INTO ENTRADA_USUARIO (LOGIN_ACESSO,SENHA_ACESSO,IDUSUARIO) "
                + "values(?,?,?)";
        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao, Statement.RETURN_GENERATED_KEYS);
            prepararinstrucao.setString(1, entrada_usuario.getLogin_acesso());
            prepararinstrucao.setString(2, entrada_usuario.getSenha_acesso());
            prepararinstrucao.setInt(3, entrada_usuario.getIdusuario().getIdusuario());
            prepararinstrucao.executeUpdate();
            resultado = prepararinstrucao.getGeneratedKeys();
            resultado.next();
            int id = resultado.getInt(1);
            entrada_usuario.setIdentrada_usuario(id);
        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar Entrada_Usuario" + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();
        }

    }

    @Override
     // SELECT PARA PESQUISAR E CONFIRMAR EXISTENCIA DE UM CADASTRO NO SISTEMA DE ACORDO COM O LOGIN_ACESSO//
    public Entrada_Usuario logarNoSistema(String login_acesso, String senha_acesso) throws Exception {

        String consulta = "SELECT* FROM CADASTRO C\n"
                + "JOIN USUARIO U ON U.idcadastro = C.idcadastro\n"
                + "JOIN ENTRADA_USUARIO E ON E.idusuario = U.idusuario\n"
                + "WHERE E.login_acesso= ? AND E.senha_acesso= ?";
        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(consulta);
            prepararinstrucao.setString(1, login_acesso);
            prepararinstrucao.setString(2, senha_acesso);
            resultado = prepararinstrucao.executeQuery();
            if (resultado.next()) {
                cadastro = new Cadastro();
                cadastro.setIdcadastro(resultado.getInt("idcadastro"));
                cadastro.setCpf(resultado.getString("cpf"));
                cadastro.setData_nac(resultado.getDate("data_nac"));
                cadastro.setEmail(resultado.getString("email"));
                cadastro.setNome(resultado.getString("nome"));
                cadastro.setSobrenome(resultado.getString("sobrenome"));
                cadastro.setTelefone(resultado.getString("telefone"));
                
                usuario = new Usuario();
                usuario.setIdusuario(resultado.getInt("idusuario"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setIdcadastro(cadastro);

                entrada_Usuario = new Entrada_Usuario();
                entrada_Usuario.setIdentrada_usuario(resultado.getInt("identrada_usuario"));
                entrada_Usuario.setLogin_acesso(login_acesso);
                entrada_Usuario.setSenha_acesso(senha_acesso);
                entrada_Usuario.setIdusuario(usuario);

            }
        } catch (Exception e) {
            System.out.println("erro ao logar usuário " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();
        }
        return entrada_Usuario;
    }

}
