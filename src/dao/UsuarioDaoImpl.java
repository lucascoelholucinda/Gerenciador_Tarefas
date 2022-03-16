package dao;

import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {

    private Connection conexao;
    private PreparedStatement prepararinstrucao;
    private ResultSet resultado;

    @Override
    //INSERT PARA SALVAR NOVO USUARIO
    public void salvar(Object object) throws Exception {
        Usuario usuario = (Usuario) object;
        String instrucao = "INSERT INTO USUARIO (LOGIN,SENHA,IDCADASTRO) VALUES(?,?,?)";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao, Statement.RETURN_GENERATED_KEYS);
            prepararinstrucao.setString(1, usuario.getLogin());
            prepararinstrucao.setString(2, usuario.getSenha());
            prepararinstrucao.setInt(3, usuario.getIdcadastro().getIdcadastro());
            prepararinstrucao.executeUpdate();
            resultado = prepararinstrucao.getGeneratedKeys();
            resultado.next();
            usuario.setIdusuario(resultado.getInt(1));

        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar Usurio   " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();
        }
    }

    @Override
     //SELECT PARA PESQUISAR LOGIN DE USUARIO NO BANCO
    public boolean BuscarUsuariosLoginDB(String usuariopesquisa) throws Exception {
        String consulta = "SELECT\n"
                + "U.login\n"
                + "FROM USUARIO U\n"
                + "WHERE U.login LIKE ?";
        List<Usuario> usuarios1 = new ArrayList<>();
        Usuario usuario1;
        conexao = ConexaoDba.conectarNoDba();
        prepararinstrucao = conexao.prepareStatement(consulta);
        prepararinstrucao.setString(1, usuariopesquisa);
        resultado = prepararinstrucao.executeQuery();
        boolean confirmausuario = false;
        if (resultado.next()) {
            usuario1 = new Usuario();
            usuario1.setLogin(resultado.getString("login"));
            usuarios1.add(usuario1);
            confirmausuario = true;
        }

        return confirmausuario;
    }

    @Override
     //SELECT PARA PESQUISAR SENHAR DE USUARIO NO BANCO
    public boolean BuscarSenhasDB(String senhapesquisa) throws Exception {
        String consulta = "SELECT\n"
                + "U.senha\n"
                + "FROM USUARIO U\n"
                + "WHERE U.senha LIKE ?";
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        conexao = ConexaoDba.conectarNoDba();
        prepararinstrucao = conexao.prepareStatement(consulta);
        prepararinstrucao.setString(1, senhapesquisa);
        resultado = prepararinstrucao.executeQuery();
        boolean confirmarsenha = false;
        if (resultado.next()) {
            usuario = new Usuario();
            usuario.setSenha(resultado.getString("senha"));
            usuarios.add(usuario);
            confirmarsenha = true;
        }

        return confirmarsenha;

    }

}
