package com.wsilva.dao.generic;


import com.wsilva.domain.Persistente;
import com.wsilva.exception.TipoChaveNaoEncontradaException;
import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    void excluir(Long valor);

    void alterar(T entity) throws TipoChaveNaoEncontradaException;

    T consultar(Long valor);

    Collection<T> buscarTodos();
}
