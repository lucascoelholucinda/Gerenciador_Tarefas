package dao;

public interface UsuarioDao {

    void salvar(Object object) throws Exception;

    boolean BuscarUsuariosLoginDB(String usuariopesquisa) throws Exception;

    boolean BuscarSenhasDB(String senhapesquisa) throws Exception;

}
