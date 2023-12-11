package com.wsilva.dao;

import com.wsilva.domain.Produto;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

import java.util.Collection;

public abstract class ProdutoDaoMock implements IProdutoDAO {
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
