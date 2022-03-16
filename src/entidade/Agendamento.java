
package entidade;

import java.io.Serializable;
import java.util.Date;

//
public class Agendamento implements Serializable  {
    private Integer idagendamento;
    private String horario_ta;
    private Date data_ta;
    private Tarefa idtarefa;
    private Usuario idusuario;

    public Agendamento() {
    }

    public Agendamento(String horario_ta, Date data_ta) {
        this.horario_ta = horario_ta;
        this.data_ta = data_ta;
    }

    public Integer getIdagendamento() {
        return idagendamento;
    }

    public void setIdagendamento(Integer idagendamento) {
        this.idagendamento = idagendamento;
    }

    public String getHorario_ta() {
        return horario_ta;
    }

    public void setHorario_ta(String horario_ta) {
        this.horario_ta = horario_ta;
    }

    public Date getData_ta() {
        return data_ta;
    }

    public void setData_ta(Date data_ta) {
        this.data_ta = data_ta;
    }

    public Tarefa getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(Tarefa idtarefa) {
        this.idtarefa = idtarefa;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    
}
