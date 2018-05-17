package br.com.tdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tdd.model.Pedido;
import br.com.tdd.model.Produto;
import br.com.tdd.repository.ProdutoRepository;
import br.com.tdd.service.ValidaPedido;

@RestController
public class PedidoController {
	
	@Autowired
	private ProdutoRepository prodRepo;
	
	@PostMapping("/pedido")
	public String cadastrar(@RequestBody Pedido pedido) {
		Produto produto = prodRepo.getOne(pedido.getIdProduto());
		
		ValidaPedido vp = new ValidaPedido();
		
		if(!vp.verificaEstoque(produto, pedido.getQtdaPedido())) {
			double valorTotal = vp.calculaTotal(produto.getPreco(), pedido.getQtdaPedido());
			if(pedido.getQtdaPedido()>=5) {			
				double valorComDesconto = vp.calculaDesconto5Produtos(valorTotal);
				return Double.toString(valorComDesconto);
			}
			else
				return Double.toString(valorTotal);
		}
		else
			return "Sem Estoque do produto pedido.";
	}

}
