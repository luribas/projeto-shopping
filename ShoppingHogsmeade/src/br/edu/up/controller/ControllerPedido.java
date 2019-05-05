package br.edu.up.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.edu.up.enums.StatusPedido;
import br.edu.up.model.Cartao;
import br.edu.up.model.Cliente;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

public class ControllerPedido {
	private List<Produto> carrinhoCompra = new ArrayList<>();
	Pedido p = new Pedido();
	public static List<Pedido> listaPedidos = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static Cartao cartao = new Cartao();
	
	public void cadastrarCarrinhoCompra(Produto p) {
		carrinhoCompra.add(p);
	}
	
	public void finalizarPedido(Cliente c, String r) {
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);	
		p.setStatus(StatusPedido.EmAberto);
		p.setRestaurante(r);
		                                                           
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
//		for (int i = 0; i < listaDePedidos().size(); i++ ) {
//			System.out.println("  - "
//			+ listaDePedidos().get(i).getListaProdPedido().get(i).getNome()
//			+ " / R$"
//			+ listaDePedidos().get(i).getListaProdPedido().get(i).getPreco()); 
//		}
		System.out.println("  -> Valor total: R$" + soma);
	}
	
	public List<Pedido> listaDePedidos() {
		return listaPedidos;
	}
	
	public void fazerPagamento(Cliente c) {
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);	
		System.out.println(" Escolha o tipo de pagamento: ");
		System.out.println(" 1 - Cart�o de D�bito");
		System.out.println(" 2 - Cart� de Cr�dito");
		System.out.println(" 3 - Dinheiro");
		int opPagamento = scanner.nextInt();
		switch (opPagamento) {
			case 1 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *           PAGAMENTO CART�O DE CR�DITO           *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println("Valor a pagar: " + p.getValorTotal());
				System.out.println(" N�mero do cart�o: ");
				long numeroCartao = scanner.nextLong();
				cartao.setNumero(numeroCartao);
				System.out.println(" CVV: ");
				int cvv = scanner.nextInt();
				cartao.setCvv(cvv);
				p.setStatus(StatusPedido.EmAberto);
				break;
			case 2 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *         PAGAMENTO CART�O DE D�BITO              *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" Favor pagar na hora de pegar o pedido.");
				p.setStatus(StatusPedido.EmAberto);
				break;
			case 3 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *              PAGAMENTO DINHEIRO                 *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" Favor pagar na hora de pegar o pedido.");
				p.setStatus(StatusPedido.EmAberto);
				break;
			default:
				System.out.println(" Op��o inv�lida. Tente Novamente.");
				break;
		}
		p.setStatus(StatusPedido.EmAberto);
	}
}
