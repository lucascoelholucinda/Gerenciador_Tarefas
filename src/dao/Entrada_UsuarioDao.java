package dao;

import entidade.Entrada_Usuario;

public interface Entrada_UsuarioDao{

    void salvar(Object object) throws Exception;
    Entrada_Usuario logarNoSistema(String login_acesso, String senha_acesso) throws Exception;

}
