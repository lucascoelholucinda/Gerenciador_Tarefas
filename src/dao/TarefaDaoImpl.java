package dao;

import entidade.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TarefaDaoImpl implements TarefaDao {

    private Connection conexao;
    private PreparedStatement preparainstrucao;
    private ResultSet resultado;

    @Override
    //INSERT PARA INSERIR UMA NOVA TAREFA
    public void salvar(Object object) throws Exception {

        Tarefa tarefa = (Tarefa) object;
        String instrucao = "INSERT INTO TAREFA(NOME_TA,NIVEL_PRIO,STATUS_TA) VALUES(?,?,?)";
        try {
            conexao = ConexaoDba.conectarNoDba();
            preparainstrucao = conexao.prepareStatement(instrucao, Statement.RETURN_GENERATED_KEYS);
            preparainstrucao.setString(1, tarefa.getNome_ta());
            preparainstrucao.setString(2, tarefa.getNivel_prio());
            preparainstrucao.setString(3, tarefa.getStatus_ta());
            preparainstrucao.executeUpdate();
            resultado = preparainstrucao.getGeneratedKeys();
            resultado.next();
            tarefa.setIdtarefa(resultado.getInt(1));

        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar tarefa:" + e.getMessage());
        } finally {
            conexao.close();
            preparainstrucao.close();
            resultado.close();

        }

    }
//DELETE PARA EXCLUIR UMA TAREFA
    @Override
    public void excluir(int id) throws Exception {
        String instrucao = "DELETE FROM TAREFA WHERE IDTAREFA= ? ";

        try {
            conexao = ConexaoDba.conectarNoDba();
            preparainstrucao = conexao.prepareStatement(instrucao);
            preparainstrucao.setInt(1, id);
            preparainstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar excluir tarefa: " + e.getMessage());
        } finally {
            conexao.close();
            preparainstrucao.close();
        }

    }

}
