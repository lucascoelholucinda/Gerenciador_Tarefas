package dao;

import entidade.Cadastro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CadastroDaoImpl implements CadastroDao {

    private Connection conexao;
    private PreparedStatement prepararinstrucao;
    private ResultSet resultado;

    @Override
     // INSERT PARA COLOCAR UM NOVO USUARIO NO SISTEMA//
    public void salvar(Object object) throws Exception {
        Cadastro cadastro = (Cadastro) object;

        String instrucao = "INSERT INTO CADASTRO (NOME, SOBRENOME, CPF, TELEFONE, EMAIL, DATA_NAC) VALUES(?,?,?,?,?,?)";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao, Statement.RETURN_GENERATED_KEYS);
            prepararinstrucao.setString(1, cadastro.getNome());
            prepararinstrucao.setString(2, cadastro.getSobrenome());
            prepararinstrucao.setString(3, cadastro.getCpf());
            prepararinstrucao.setString(4, cadastro.getTelefone());
            prepararinstrucao.setString(5, cadastro.getEmail());
            prepararinstrucao.setDate(6, (Date) cadastro.getData_nac());
            prepararinstrucao.executeUpdate();
            resultado = prepararinstrucao.getGeneratedKeys();
            resultado.next();
            cadastro.setIdcadastro(resultado.getInt(1));
        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar Cadastro " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();

        }
    }

    @Override
    // SELECT PARA PESQUISAR CPF DO USUARIO AO TENTAR CADASTRAR NO SISTEMA//
    public boolean BuscarUsuariosCpfDB(String cpfpesquisa) throws Exception {
        String consulta = "SELECT\n"
                + "C.cpf\n"
                + "FROM CADASTRO C\n"
                + "WHERE C.cpf LIKE ?";
        List<Cadastro> cadastros = new ArrayList<>();
        Cadastro cadastro;
        conexao = ConexaoDba.conectarNoDba();
        prepararinstrucao = conexao.prepareStatement(consulta);
        prepararinstrucao.setString(1, cpfpesquisa);
        resultado = prepararinstrucao.executeQuery();
        boolean confirmarcpf= false;
        if (resultado.next()) {
            cadastro = new Cadastro();
            cadastro.setCpf(resultado.getString("cpf"));
            cadastros.add(cadastro);
            confirmarcpf = true;
        }

        return confirmarcpf;

    }

}
