package com.wsilva.domain;

import com.wsilva.dao.ClienteDaoMock;
import com.wsilva.dao.IClienteDAO;
import com.wsilva.exception.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;
    public ClienteDAOTest(){
        clienteDAO = new ClienteDaoMock();

    }
    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Williams");
        cliente.setCidade("Barueri");
        cliente.setEstado("São Paulo");
        cliente.setEnd("End");
        cliente.setNumero(500);
        cliente.setTel(11999999999L);
        clienteDAO.cadastrar(cliente);

    }
    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno =  clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Levi e Williams");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("Levi e Williams", cliente.getNome());
    }
}
