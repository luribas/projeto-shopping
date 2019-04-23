package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Cliente;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

public class ControllerPedido {
	private List<Produto> carrinhoCompra;
	Pedido p = new Pedido();
	
	public void cadastrarCarrinhoCompra(Produto p) {
			carrinhoCompra = new ArrayList<>();
			carrinhoCompra.add(p);
	}
	
	public void finalizarPedido(Cliente c) {
		Pedido p = new Pedido();
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);	
		
		
	}
}
