package com.wsilva.dao;

import com.wsilva.dao.generic.IGenericDAO;
import com.wsilva.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {
    Produto consultar(String valor);
}
