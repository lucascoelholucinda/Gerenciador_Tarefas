package dao;

import entidade.Cadastro;
import java.util.List;

public interface CadastroDao {

    void salvar(Object object) throws Exception;

    boolean BuscarUsuariosCpfDB(String cpfpesquisa) throws Exception;

}
