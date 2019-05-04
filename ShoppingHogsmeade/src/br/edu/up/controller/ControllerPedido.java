package br.edu.up.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
		                                                           
		Calendar data = Calendar.getInstance();   
		
		String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data.getTime());
		p.setData(dataFormatada);    
		
		double soma = 0;
		for (int i = 0; i < carrinhoCompra.size(); i++) {
			soma = soma + carrinhoCompra.get(i).getPreco();
		}
		p.setValorTotal(soma);
		
		listaPedidos.add(p);
		
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                 NOTA FISCAL                     *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("   Data do pedido: " + p.getData());
		System.out.print("\n  ");
		for (int i = 0; i < listaDePedidos().size(); i++ ) {
			for (int j = 0; j < listaDePedidos().get(i).getListaProdPedido().size(); i++) {
				System.out.println("  - "
						+ listaDePedidos().get(i).getListaProdPedido().get(j).getNome()
						+ " / R$"
						+ listaDePedidos().get(i).getListaProdPedido().get(j).getPreco()); 
			}
			
			
		}
		System.out.println("\n   -> Valor total: R$" + soma);
	}
	
	public List<Pedido> listaDePedidos() {
		return listaPedidos;
	}
}
