package com.wsilva.dao.generic;


import com.wsilva.domain.Persistente;
import com.wsilva.dao.generic.IGenericServer;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericServer<T extends Persistente, E extends Serializable>
        implements IGenericServer<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericServer(IGenericDAO<T, E>dao){
        this.dao = dao;
    }
    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir((Long) valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar((Long) valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
