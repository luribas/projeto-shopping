package br.edu.up.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.up.model.Cliente;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

public class ControllerPedido {
	private List<Produto> carrinhoCompra;
	Pedido p = new Pedido();
	static List<Pedido> listaPedidos = new ArrayList<>();
	
	public void cadastrarCarrinhoCompra(Produto p) {
			carrinhoCompra = new ArrayList<>();
			carrinhoCompra.add(p);
	}
	
	public void finalizarPedido(Cliente c) {
		Pedido p = new Pedido();
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);	
		p.setStatus(0);
		
		Date hoje = new Date();		
		p.setData(hoje);
		double soma = 0;
		for (int i = 0; i < carrinhoCompra.size(); i++) {
			soma = soma + carrinhoCompra.get(i).getPreco();
		}
		System.out.println("Valor: " + soma + "\n");
		p.setValorTotal(soma);
		
		listaPedidos.add(p);
	}
	
	public List<Pedido> listaDePedidos() {
		return listaPedidos;
	}
}
