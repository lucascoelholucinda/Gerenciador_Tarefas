package entidade;

import java.io.Serializable;
import java.util.Date;


public class Cadastro implements Serializable  {
    private Integer idcadastro;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String email;
    private Date data_nac;

    public Cadastro() {
    }

    public Cadastro(String nome, String sobrenome, String cpf, String telefone, String email, Date data_nac) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.data_nac = data_nac;
    }

    public Integer getIdcadastro() {
        return idcadastro;
    }

    public void setIdcadastro(Integer idcadastro) {
        this.idcadastro = idcadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nac() {
        return data_nac;
    }

    public void setData_nac(Date data_nac) {
        this.data_nac = data_nac;
    }

   


   

   
    
}
