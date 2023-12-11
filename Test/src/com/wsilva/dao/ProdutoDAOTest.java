package com.wsilva.dao;

import com.wsilva.domain.Produto;
import com.wsilva.domain.Venda;
import com.wsilva.exception.TipoChaveNaoEncontradaException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ProdutoDAOTest extends TestCase {

    private final IProdutoDAO produtoDao = new ProdutoDAO() {
        @Override
        public Produto consultar(String valor) {
            return null;
        }

        @Override
        public void excluir(String valor) {

        }

        @Override
        public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

        }
    };

    private Produto produto;

    public ProdutoDAOTest() {
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisar() {
        Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        produto.setCodigo("A2");
        Boolean retorno = produtoDao.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        produto.setNome("Rodrigo Pires");
        produtoDao.alterar(produto);

        Assert.assertEquals("Rodrigo Pires", produto.getNome());
    }

    @Test
    public void buscarTodos() {
        Collection<Produto> list = produtoDao.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());
    }

    @Test
    public void getTipoClasse() {
    }

    @Test
    public void atualiarDados() {
    }
}