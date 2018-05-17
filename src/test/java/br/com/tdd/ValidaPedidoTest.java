package br.com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.tdd.model.Produto;
import br.com.tdd.service.ValidaPedido;

public class ValidaPedidoTest {
	
	ValidaPedido vp;
	
	@Before
	public void init() {
		vp = new ValidaPedido();
	}
	
	@Test
	public void deveCalcularValorTotalPedido() {
		double valorTotal = vp.calculaTotal(1000,5);
		assertEquals(5000, valorTotal, 0.001);
	}
	
	@Test
	public void deveCalcularDescontoAVista() {
		double valorComDesconto = vp.calculaDescontoAVista(1000);
		assertEquals(900, valorComDesconto, 0.001);
	}
	
	@Test
	public void deveCalcularDescontoDe5Produtos() {
		double valorComDesconto5Produtos = vp.calculaDesconto5Produtos(1000);
		assertEquals(950, valorComDesconto5Produtos, 0.001);
	}
	
	@Test
	public void deveVerificarEstoque() {
		Produto p = new Produto(1, 250, 5);
		boolean estoque = vp.verificaEstoque(p, 5);
		assertTrue(estoque);
	}

}
