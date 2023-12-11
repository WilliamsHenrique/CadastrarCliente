package com.wsilva.domain;

import com.wsilva.dao.ClienteDaoMock;
import com.wsilva.dao.IClienteDAO;
import com.wsilva.exception.TipoChaveNaoEncontradaException;
import com.wsilva.service.ClienteService;
import com.wsilva.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author williams.silva
 */

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;
    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Williams");
        cliente.setCidade("Barueri");
        cliente.setEstado("São Paulo");
        cliente.setEnd("End");
        cliente.setNumero(500);
        cliente.setTel(11999999999L);

    }
    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno =  clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Levi e Williams");
        clienteService.alterar(cliente);
        Assert.assertEquals("Levi e Williams", cliente.getNome());
    }
}
