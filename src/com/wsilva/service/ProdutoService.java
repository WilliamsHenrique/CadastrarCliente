package com.wsilva.service;

import com.wsilva.dao.generic.GenericServer;
import com.wsilva.dao.generic.IGenericDAO;
import com.wsilva.domain.Produto;

public class ProdutoService extends GenericServer<Produto, String> implements IProdutoService{
    public ProdutoService(IGenericDAO<Produto, String> dao) {
        super(dao);
    }
}
