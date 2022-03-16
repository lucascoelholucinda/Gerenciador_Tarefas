package entidade;

import java.io.Serializable;

public class Tarefa implements Serializable  {
    
    private Integer idtarefa;
    private String nome_ta;
    private String nivel_prio;
    private String status_ta;

    public Tarefa() {
    }

    public Tarefa(String nome_ta, String nivel_prio, String status_ta) {
        this.nome_ta = nome_ta;
        this.nivel_prio = nivel_prio;
        this.status_ta = status_ta;
    }

    public Integer getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(Integer idtarefa) {
        this.idtarefa = idtarefa;
    }

    public String getNome_ta() {
        return nome_ta;
    }

    public void setNome_ta(String nome_ta) {
        this.nome_ta = nome_ta;
    }

    public String getNivel_prio() {
        return nivel_prio;
    }

    public void setNivel_prio(String nivel_prio) {
        this.nivel_prio = nivel_prio;
    }

    public String getStatus_ta() {
        return status_ta;
    }

    public void setStatus_ta(String status_ta) {
        this.status_ta = status_ta;
    }

    
}
