package br.edu.up.controller;

import java.text.DecimalFormat;
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
	
	public List<Pedido> listaDePedidos() {
		return listaPedidos;
	}
	
	public void cadastrarCarrinhoCompra(Produto p) {
		carrinhoCompra.add(p);
	}
	
	public void finalizarPedido(Cliente c, String r) {
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);
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
		System.out.println(" -> Valor total: R$" + soma);
	}
	
	public void fazerPagamento(Cliente c) {
		p.setC(c);
		p.setListaProdPedido(carrinhoCompra);
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                     PAGAMENTO                   *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("  Escolha o tipo de pagamento: ");
		System.out.println("  1 - Cartão de Crédito");
		System.out.println("  2 - Cartão de Débito");
		System.out.println("  3 - Dinheiro");
		System.out.print("  -> ");
		int opPagamento = scanner.nextInt();
		switch (opPagamento) {
			case 1 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *           PAGAMENTO CARTÃO DE CRÉDITO           *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" Valor total a pagar: " + p.getValorTotal());
				System.out.println(" Número do cartão: ");
				long numeroCartao = scanner.nextLong();
				cartao.setNumero(numeroCartao);
				System.out.println(" CVV: ");
				int cvv = scanner.nextInt();
				cartao.setCvv(cvv);
				System.out.println("\n * Pagamento realizado com sucesso! *");
				p.setStatus(StatusPedido.EmAberto);
				break;
			case 2 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *         PAGAMENTO CARTÃO DE DÉBITO              *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" Favor pagar no caixa.");
				System.out.println(" Valor total a pagar: " + p.getValorTotal());
				p.setStatus(StatusPedido.EmAberto);
				break;
			case 3 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *              PAGAMENTO DINHEIRO                 *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println("  Valor total a pagar: R$" + p.getValorTotal());
				System.out.print("  Quanto deseja pagar? R$");
				double valorPagar = 0;
				valorPagar = scanner.nextDouble();
				double troco = valorPagar - p.getValorTotal();
				DecimalFormat df = new DecimalFormat("0.##");
				String dx = df.format(troco);
				System.out.print("\n  -> Seu troco será: R$" + dx);
				
				System.out.println("\n  * Favor pagar no caixa. *");
				p.setStatus(StatusPedido.EmAberto);
				break;
			default:
				System.out.println(" Opção inválida. Tente Novamente.");
				break;
		}
	}
}
