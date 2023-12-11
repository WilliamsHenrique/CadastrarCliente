package com.wsilva.dao;

import com.wsilva.dao.generic.GenericDAO;
import com.wsilva.domain.Cliente;
import com.wsilva.domain.Venda;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

public class ClienteDAO< S > extends GenericDAO<Cliente, S> implements IClienteDAO {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

    }
}
