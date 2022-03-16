package dao;

public interface CadastroDao {

    void salvar(Object object) throws Exception;

    boolean BuscarUsuariosCpfDB(String cpfpesquisa) throws Exception;

}
