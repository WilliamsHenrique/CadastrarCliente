package com.wsilva.dao.generic;

import com.wsilva.domain.Persistente;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericServer<T extends Persistente, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(E valor);

    public Collection<T> buscarTodos();

}

