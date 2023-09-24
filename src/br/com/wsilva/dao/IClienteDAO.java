package br.com.wsilva.dao;

import br.com.wsilva.domain.Cliente;
import java.util.Collection;

/**
 * @author williams.silva
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();


}
