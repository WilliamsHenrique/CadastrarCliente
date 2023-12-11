package com.wsilva.dao;

import com.wsilva.dao.generic.IGenericDAO;
import com.wsilva.domain.Venda;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
