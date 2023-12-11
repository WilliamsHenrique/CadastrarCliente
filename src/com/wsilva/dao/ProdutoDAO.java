package com.wsilva.dao;

import com.wsilva.dao.generic.GenericDAO;
import com.wsilva.domain.Produto;
import com.wsilva.domain.Venda;
import com.wsilva.exception.TipoChaveNaoEncontradaException;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(String.valueOf(entity.getCodigo()));
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }
}