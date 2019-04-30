package br.edu.up.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.up.model.Cliente;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

public class ControllerPedido {
	private List<Produto> carrinhoCompra = new ArrayList<>();
	Pedido p = new Pedido();
	static List<Pedido> listaPedidos = new ArrayList<>();
	
	public void cadastrarCarrinhoCompra(Produto p) {
		carrinhoCompra.add(p);
	}
	
	public void finalizarPedido(Cliente c) {
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);	
		p.setStatus(1);
		
		Date hoje = new Date();
		p.setData(hoje);
		double soma = 0;
		for (int i = 0; i < carrinhoCompra.size(); i++) {
			soma = soma + carrinhoCompra.get(i).getPreco();
		}
		p.setValorTotal(soma);
		
		listaPedidos.add(p);
		
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                 NOTA FISCAL                     *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		for (int i = 0; i < listaDePedidos().size(); i++ ) {
			System.out.println("\n " 
		    + p.getData() 
		    + "\n\n "
			+ listaDePedidos().get(listaDePedidos().size()-1).getListaProdPedido().get(i).getNome()
			+ " / R$"
			+ listaDePedidos().get(listaDePedidos().size()-1).getListaProdPedido().get(i).getPreco()
			+ "\n -> Valor total: R$" + soma); 
		}
	}
	
	public List<Pedido> listaDePedidos() {
		return listaPedidos;
	}
}
