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
	static DecimalFormat df = new DecimalFormat("0.##");
	
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

		if(p.getSenha() == 0) {
			p.setSenha(1); 
		} else {
			int id = p.getSenha();
			id = id++;
			p.setSenha(id);
		}
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
		for (int i=0; i<listaPedidos.size(); i++){
			for (int j = 0; j< listaPedidos.get(i).getListaProdPedido().size(); j++) {
				System.out.println("\n   " + (j+1) + " - " + listaPedidos.get(i).getListaProdPedido().get(j).getNome()
						+ " / R$"+ listaPedidos.get(i).getListaProdPedido().get(j).getPreco());
			}
		}
		String dxSoma = df.format(soma);
		System.out.println("\n   -> Valor total: R$" + dxSoma);
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
				String dxValorTotal = df.format(p.getValorTotal());
				System.out.print(" Valor total a pagar: " + dxValorTotal);
				System.out.print("\n Número do cartão: ");
				String numeroCartao = scanner.next();
				cartao.setNumero(numeroCartao);
				System.out.print(" CVV: ");
				int cvv = scanner.nextInt();
				cartao.setCvv(cvv);
				System.out.print(" Nome do titular: ");
				String nome = scanner.next();
				cartao.setNomeCartao(nome);
				System.out.print(" CPF: ");
				String cpf = scanner.next();
				cartao.setCpf(cpf);
				System.out.println("\n * Pagamento realizado com sucesso! *");
				p.setStatus(StatusPedido.EmAberto);
				break;
			case 2 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *         PAGAMENTO CARTÃO DE DÉBITO              *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				String dxDebito = df.format(p.getValorTotal());
				System.out.println("  Valor total a pagar: R$" + dxDebito);
				System.out.println("\n  * Favor pagar no caixa. *");
				p.setStatus(StatusPedido.AguardandoPagamento);
				break;
			case 3 :
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *              PAGAMENTO DINHEIRO                 *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				String dxDinheiro = df.format(p.getValorTotal());
				System.out.println("  Valor total a pagar: R$" + dxDinheiro);
				double valorPagar = 0;
				do {
					System.out.print("\n  Qual o valor será pago? R$");
					valorPagar = scanner.nextDouble();
				
					if (valorPagar < p.getValorTotal()) {
						System.out.println("\n Esse valor é menor que o total a pagar! \n Tente novamente. ");
					} else {
						double troco = valorPagar - p.getValorTotal();
						String dx = df.format(troco);
						System.out.print("\n  -> Seu troco será: R$" + dx);
						
						System.out.println("\n  * Favor pagar no caixa. *");
						p.setStatus(StatusPedido.AguardandoPagamento);
					} 
				} while (valorPagar < p.getValorTotal());
				break;
			default:
				System.out.println(" Opção inválida. Tente Novamente.");
				break;
		}
	}
}
