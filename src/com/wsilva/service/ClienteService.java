package com.wsilva.service;

import com.wsilva.dao.IClienteDAO;
import com.wsilva.dao.generic.GenericServer;
import com.wsilva.domain.Cliente;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

public class ClienteService extends GenericServer implements IClienteService {

    private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO){
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }
    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);

    }
}
