package dao;

import entidade.Agendamento;
import java.util.Date;
import java.util.List;
public interface AgendamentoDao{
///
    List<Agendamento> pesquisarTarefaNoAgendamento(String nome_ta, String login_acesso) throws Exception;

    List<Agendamento> pesquisarPrioridadeNoAgendamento(String prioridade, String login_acesso) throws Exception;

    List<Agendamento> pesquisarStatusNoAgendamento(String status_ta, String login_acesso) throws Exception;

    void salvarTarefaNoAgendamento(Object object) throws Exception;

    void alterarTarefaNoAgendamento(String tarefaalterada, int idtarefa) throws Exception;

    void alterarPrioridadeNoAgendamento(String prioridade, int idtarefa) throws Exception;

    void alterarStatusNoAgendamento(String status, int idtarefa) throws Exception;

    void alterarHoraNoAgendamento(String hora, int idtarefa, int idusuario) throws Exception;

    void alterarDataNoAgendamento(Date data, int idtarefa, int idusuario) throws Exception;
    
   
}
