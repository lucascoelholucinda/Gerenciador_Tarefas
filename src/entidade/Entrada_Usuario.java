package entidade;

import java.io.Serializable;

public class Entrada_Usuario implements Serializable  {
   
    private Integer identrada_usuario;
    private String login_acesso;
    private String senha_acesso;
    private Usuario idusuario;

    public Entrada_Usuario() {
    }

    public Entrada_Usuario(String login_acesso, String senha_acesso) {
        this.login_acesso = login_acesso;
        this.senha_acesso = senha_acesso;
    }

    public Integer getIdentrada_usuario() {
        return identrada_usuario;
    }

    public void setIdentrada_usuario(Integer identrada_usuario) {
        this.identrada_usuario = identrada_usuario;
    }

    public String getLogin_acesso() {
        return login_acesso;
    }

    public void setLogin_acesso(String login_acesso) {
        this.login_acesso = login_acesso;
    }

    public String getSenha_acesso() {
        return senha_acesso;
    }

    public void setSenha_acesso(String senha_acesso) {
        this.senha_acesso = senha_acesso;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

  
    


  
  
    
}
