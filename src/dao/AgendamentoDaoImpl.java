package dao;

import entidade.Agendamento;
import entidade.Entrada_Usuario;
import entidade.Tarefa;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDaoImpl implements AgendamentoDao {

    private Connection conexao;
    private PreparedStatement prepararinstrucao;
    private ResultSet resultado;

    @Override
    // INSERT PARA SALVAR TAREFA NO AGENDAMENTO//
    public void salvarTarefaNoAgendamento(Object object) throws Exception {

        Agendamento agendamento = (Agendamento) object;
        String instrucao = "INSERT INTO AGENDAMENTO(HORARIO_TA,DATA_TA,idTAREFA,idUSUARIO) VALUES(?,?,?,?)";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao, Statement.RETURN_GENERATED_KEYS);
            prepararinstrucao.setString(1, agendamento.getHorario_ta());
            prepararinstrucao.setDate(2, (Date) agendamento.getData_ta());
            prepararinstrucao.setInt(3, agendamento.getIdtarefa().getIdtarefa());
            prepararinstrucao.setInt(4, agendamento.getIdusuario().getIdusuario());
            prepararinstrucao.executeUpdate();
            resultado = prepararinstrucao.getGeneratedKeys();
            resultado.next();
            agendamento.setIdagendamento(resultado.getInt(1));

        } catch (Exception e) {
            System.out.println("Erro ao tentar salvar agendamento: " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();
        }

    }
// SELECT PARA VER AS TAREFA NO AGENDAMENTO DE UM USUARIO//
    @Override
    public List<Agendamento> pesquisarTarefaNoAgendamento(String nome_ta, String login_acesso) throws Exception {
        String instrucao = "SELECT*FROM  Tarefa T\n"
                + "JOIN AGENDAMENTO A ON A.idtarefa = T.idtarefa\n"
                + "JOIN USUARIO U ON U.idusuario = A.idusuario\n"
                + "JOIN ENTRADA_USUARIO E ON E.idusuario = U.idusuario\n"
                + "WHERE T.nome_ta ~*? AND E.login_acesso= ?";
        List<Agendamento> agendamentos = new ArrayList<>();

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, nome_ta);
            prepararinstrucao.setString(2, login_acesso);
            resultado = prepararinstrucao.executeQuery();
            Agendamento agendamento;
            while (resultado.next()) {
                agendamento = new Agendamento();
                Tarefa tarefa = new Tarefa();
                Usuario usuario = new Usuario();
                usuario.setIdusuario(resultado.getInt("idusuario"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                Entrada_Usuario entrada_Usuario = new Entrada_Usuario();
                entrada_Usuario.setIdusuario(usuario);
                tarefa.setIdtarefa(resultado.getInt("idtarefa"));
                tarefa.setNome_ta(resultado.getString("nome_ta"));
                tarefa.setNivel_prio(resultado.getString("nivel_prio"));
                tarefa.setStatus_ta(resultado.getString("status_ta"));
                agendamento.setIdtarefa(tarefa);
                agendamento.setIdusuario(usuario);
                agendamento.setIdagendamento(resultado.getInt("idagendamento"));
                agendamento.setData_ta(resultado.getDate("data_ta"));
                agendamento.setHorario_ta(resultado.getString("horario_ta"));
                agendamentos.add(agendamento);
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar tarefa no agendametos" + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();

        }

        return agendamentos;

    }
// UPDATE PARA AlTERAR AS TAREFA NO AGENDAMENTO DE UM USUARIO//
    @Override
    public void alterarTarefaNoAgendamento(String tarefaalterada, int idtarefa) throws Exception {

        String instrucao = "UPDATE TAREFA T\n"
                + "SET nome_ta= ? \n"
                + "WHERE idtarefa=?";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, tarefaalterada);
            prepararinstrucao.setInt(2, idtarefa);
            prepararinstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar o nome da tarefa no AgendamentoDaoImpl " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
        }

    }

    @Override
// UPDATE PARA AlLTERAR A PRIORIDADE NO AGENDAMENTO DE UM USUARIO//
    public void alterarPrioridadeNoAgendamento(String prioridade, int idtarefa) throws Exception {

        String instrucao = "UPDATE TAREFA T\n"
                + "SET nivel_prio= ? \n"
                + "WHERE idtarefa=? ";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, prioridade);
            prepararinstrucao.setInt(2, idtarefa);
            prepararinstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar Prioridade da tarefa no AgendamentoDaoImpl " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
        }
    }

    @Override
    // UPDATE PARA AlLTERAR O STATUS NO AGENDAMENTO DE UM USUARIO//(
    public void alterarStatusNoAgendamento(String status, int idtarefa) throws Exception {
        String instrucao = "UPDATE TAREFA T\n"
                + "SET status_ta= ? \n"
                + "WHERE idtarefa= ?";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, status);
            prepararinstrucao.setInt(2, idtarefa);
            prepararinstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar status da tarefa no AgendamentoDaoImpl " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
        }
    }

    @Override
    // UPDATE PARA AlLTERAR O HORARIO NO AGENDAMENTO DE UM USUARIO//(
    public void alterarHoraNoAgendamento(String hora, int idtarefa, int idusuario) throws Exception {
        String instrucao = "UPDATE AGENDAMENTO \n"
                + "SET horario_ta= ?\n"
                + "WHERE idtarefa= ? and idusuario=?";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, hora);
            prepararinstrucao.setInt(2, idtarefa);
            prepararinstrucao.setInt(3, idusuario);
            prepararinstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar hora da tarefa no AgendamentoDaoImpl " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
        }
    }
// UPDATE PARA AlLTERAR A DATA NO AGENDAMENTO DE UM USUARIO//
    @Override
    public void alterarDataNoAgendamento(java.util.Date data, int idtarefa, int idusuario) throws Exception {
        String instrucao = "UPDATE AGENDAMENTO A\n"
                + "SET data_ta= ? \n"
                + "WHERE A.idtarefa= ? AND A.idusuario= ? ;";

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setDate(1, (Date) data);
            prepararinstrucao.setInt(2, idtarefa);
            prepararinstrucao.setInt(3, idusuario);
            prepararinstrucao.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao tentar alterar data da tarefa no AgendamentoDaoImpl " + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
        }

    }

    @Override
    // SELECT PARA PESQUISAR PRIORIDADE NO AGENDAMENTO DE UM USUARIO//
    public List<Agendamento> pesquisarPrioridadeNoAgendamento(String prioridade, String login_acesso) throws Exception {

        String instrucao = "SELECT*FROM  Tarefa T\n"
                + "JOIN AGENDAMENTO A ON A.idtarefa = T.idtarefa\n"
                + "JOIN USUARIO U ON U.idusuario = A.idusuario\n"
                + "JOIN ENTRADA_USUARIO E ON E.idusuario = U.idusuario\n"
                + "WHERE T.nivel_prio= ? and E.login_acesso= ? ";
        List<Agendamento> agendamentos = new ArrayList<>();

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, prioridade);
            prepararinstrucao.setString(2, login_acesso);
            resultado = prepararinstrucao.executeQuery();
            Agendamento agendamento;
            while (resultado.next()) {
                agendamento = new Agendamento();
                Tarefa tarefa = new Tarefa();
                Usuario usuario = new Usuario();
                usuario.setLogin(resultado.getString("login"));
                Entrada_Usuario entrada_Usuario = new Entrada_Usuario();
                entrada_Usuario.setIdusuario(usuario);
                tarefa.setIdtarefa(resultado.getInt("idtarefa"));
                tarefa.setNome_ta(resultado.getString("nome_ta"));
                tarefa.setNivel_prio(prioridade);
                tarefa.setStatus_ta(resultado.getString("status_ta"));
                agendamento.setIdtarefa(tarefa);
                agendamento.setIdagendamento(resultado.getInt("idagendamento"));
                agendamento.setData_ta(resultado.getDate("data_ta"));
                agendamento.setHorario_ta(resultado.getString("horario_ta"));
                agendamentos.add(agendamento);
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar tarefas por prioridade no agendametos" + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();

        }

        return agendamentos;
    }

    @Override
    // SELECT PARA PESQUISAR STATUS NO AGENDAMENTO DE UM USUARIO//
    public List<Agendamento> pesquisarStatusNoAgendamento(String status_ta, String login_acesso) throws Exception {

        String instrucao = "SELECT*FROM  Tarefa T\n"
                + "JOIN AGENDAMENTO A ON A.idtarefa = T.idtarefa\n"
                + "JOIN USUARIO U ON U.idusuario = A.idusuario\n"
                + "JOIN ENTRADA_USUARIO E ON E.idusuario = U.idusuario\n"
                + "WHERE T.status_ta= ? and E.login_acesso= ? ";
        List<Agendamento> agendamentos = new ArrayList<>();

        try {
            conexao = ConexaoDba.conectarNoDba();
            prepararinstrucao = conexao.prepareStatement(instrucao);
            prepararinstrucao.setString(1, status_ta);
            prepararinstrucao.setString(2, login_acesso);
            resultado = prepararinstrucao.executeQuery();
            Agendamento agendamento;
            while (resultado.next()) {
                agendamento = new Agendamento();
                Tarefa tarefa = new Tarefa();
                Usuario usuario = new Usuario();
                usuario.setLogin(resultado.getString("login"));
                Entrada_Usuario entrada_Usuario = new Entrada_Usuario();
                entrada_Usuario.setIdusuario(usuario);
                tarefa.setIdtarefa(resultado.getInt("idtarefa"));
                tarefa.setNome_ta(resultado.getString("nome_ta"));
                tarefa.setStatus_ta(status_ta);
                tarefa.setNivel_prio(resultado.getString("nivel_prio"));
                agendamento.setIdtarefa(tarefa);
                agendamento.setIdagendamento(resultado.getInt("idagendamento"));
                agendamento.setData_ta(resultado.getDate("data_ta"));
                agendamento.setHorario_ta(resultado.getString("horario_ta"));
                agendamentos.add(agendamento);
            }

        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar tarefas por prioridade no agendametos" + e.getMessage());
        } finally {
            conexao.close();
            prepararinstrucao.close();
            resultado.close();

        }

        return agendamentos;
    }

}
