package br.com.tdd.service;

import br.com.tdd.model.Produto;

public class ValidaPedido {
	
	public double calculaTotal(double preco, int qtda) {
		return preco*qtda;
	}

	public double calculaDescontoAVista(double valorTotal) {
		return valorTotal*0.9;
	}

	public double calculaDesconto5Produtos(double valorTotal) {
		return valorTotal*0.95;
	}

	public boolean verificaEstoque(Produto produto, int qtdaPedido) {
		if (produto.getQtdaEstoque() <= qtdaPedido) 
			return true;
		else
			return false;
	}

}