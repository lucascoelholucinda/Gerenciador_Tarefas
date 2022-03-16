package entidade;

import java.io.Serializable;

public class Usuario implements Serializable {

    private Integer idusuario;
    private String login;
    private String senha;
    private Cadastro idcadastro;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cadastro getIdcadastro() {
        return idcadastro;
    }

    public void setIdcadastro(Cadastro idcadastro) {
        this.idcadastro = idcadastro;
    }

}
