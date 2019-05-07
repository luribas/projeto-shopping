package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.controller.ControllerCozinha;
import br.edu.up.controller.ControllerPedido;
import br.edu.up.enums.StatusPedido;
import br.edu.up.model.Cozinha;
import br.edu.up.model.Pedido;

public class CozinhaView {
	static Principal principal = new Principal();
	static ControllerPedido controllerPedido = new ControllerPedido();
	static ControllerCozinha controllerCozinha = new ControllerCozinha();
	static Scanner scanner = new Scanner(System.in);
	static List<Pedido> listaPedidos = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	public static void menuCozinha() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                 MENU COZINHA                    *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" 1 - Ver pedidos");
		System.out.println(" 2 - Voltar ao Menu Principal");
		System.out.print("\n -> ");
		int opCozinha = 0;
		opCozinha = scanner.nextInt();
		switch(opCozinha) {
			case 1 : 
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *              SELECIONE RESTAURANTE              *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" 1 - Caldeir�o Furado");
				System.out.println(" 2 - Tr�s Vassouras");
				System.out.println(" 3 - Cabe�a de Javali");
				System.out.println(" 4 - Voltar ao Menu da Cozinha");
				System.out.print("\n -> ");
				int restOpcao = 0;
				restOpcao = scanner.nextInt(); 
				switch (restOpcao)
				{
					case 1: 
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" *       VISUALIZAR PEDIDOS CALDEIR�O FURADO       *");
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("caldeirao")
									&& controllerPedido.listaPedidos.get(i).getStatus().equals(StatusPedido.EmAberto)){
								System.out.println("  Senha do Pedido: " + controllerPedido.listaPedidos.get(i).getSenha());
								System.out.println("  Produtos:");	 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {
									System.out.println("   " + (j+1) 
											+ " - " 
											+ controllerPedido.listaPedidos.get(i).getListaProdPedido()
																	       .get(j).getNome());
								}
								System.out.println("  Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("  Cliente: " + controllerPedido.listaPedidos.get(i).getC().getNome());
								System.out.println("  Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("  Valor total: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							} else {
								System.out.println("\n N�o h� nenhum pedido Em Aberto.");
							}
						}
						System.out.println("\n Digite a op��o desejada: ");
						System.out.println(" 1 - Marcar pedido como Pronto ");
						System.out.println(" 2 - Voltar ao menu da cozinha");
						System.out.print(" -> ");
						int opPedidos;
						do {
							opPedidos = scanner.nextInt();
							switch(opPedidos) {
								case 1:
									// fun��o de finalizar
								break;
								case 2:
									menuCozinha();
								break;
								default:
									System.out.println(" Op��o inv�lida. Tente novamente.");
									menuCozinha();
								break;
							}
						} while (opPedidos > 0 && opPedidos < 3);
						break;
					case 2:
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" *       VISUALIZAR PEDIDOS TR�S VASSORAS          *");
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("tres")
									&& controllerPedido.listaPedidos.get(i).getStatus().equals(StatusPedido.EmAberto)){
								System.out.println("  Senha do Pedido: " + controllerPedido.listaPedidos.get(i).getSenha());
								System.out.println("  Produtos:");	 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {
									System.out.println("   " + (j+1) 
											+ " - " 
											+ controllerPedido.listaPedidos.get(i).getListaProdPedido()
																	       .get(j).getNome());
								}
								System.out.println("  Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("  Cliente: " + controllerPedido.listaPedidos.get(i).getC().getNome());
								System.out.println("  Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("  Valor total: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							} else {
								System.out.println("\n N�o h� nenhum pedido Em Aberto.");
							}
						}
						System.out.println("\n Digite a op��o desejada: ");
						System.out.println(" 1 - Marcar pedido como Pronto ");
						System.out.println(" 2 - Voltar ao menu da cozinha");
						System.out.print(" -> ");
						int opPedidosTres;
						do {
							opPedidosTres = scanner.nextInt();
							switch(opPedidosTres) {
								case 1:
									// fun��o de finalizar
								break;
								case 2:
									menuCozinha();
								break;
								default:
									System.out.println(" Op��o inv�lida. Tente novamente.");
									menuCozinha();
								break;
							}
						} while (opPedidosTres > 0 && opPedidosTres < 3);
						break;
					case 3:
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("javali")
									&& controllerPedido.listaPedidos.get(i).getStatus().equals(StatusPedido.EmAberto)){
								System.out.println("  Senha do Pedido: " + controllerPedido.listaPedidos.get(i).getSenha());
								System.out.println("  Produtos:");	 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {
									System.out.println("   " + (j+1) 
											+ " - " 
											+ controllerPedido.listaPedidos.get(i).getListaProdPedido()
																	       .get(j).getNome());
								}
								System.out.println("  Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("  Cliente: " + controllerPedido.listaPedidos.get(i).getC().getNome());
								System.out.println("  Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("  Valor total: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							} else {
								System.out.println("\n N�o h� nenhum pedido Em Aberto.");
							}
						}
						System.out.println("\n Digite a op��o desejada: ");
						System.out.println(" 1 - Marcar pedido como Pronto ");
						System.out.println(" 2 - Voltar ao menu da cozinha");
						System.out.print(" -> ");
						int opPedidosJavali;
						do {
							opPedidosJavali = scanner.nextInt();
							switch(opPedidosJavali) {
								case 1:
									// fun��o de finalizar
								break;
								case 2:
									menuCozinha();
								break;
								default:
									System.out.println(" Op��o inv�lida. Tente novamente.");
									menuCozinha();
								break;
							}
						} while (opPedidosJavali > 0 && opPedidosJavali < 3);
						break;
					case 4 :
						menuCozinha();
						break;
					default:
						System.out.println(" Op��o inv�lida. Tente novamente.");
						break;
				}
				break;
			case 2 :
				principal.menuPrincipal();
				break;
			default :
				System.out.println(" Op��o inv�lida. Tente novamente.");
				break;
		}
	}
	
	static void loginCozinha(){
		Cozinha cozinha1 = new Cozinha("cozinha", "cozinha");
		controllerCozinha.cadastrarCozinha(cozinha1);
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                 LOGIN COZINHA                   *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: "); 
		String senha = scanner.next();
		boolean retorno = controllerCozinha.autenticarCozinha(login, senha);
		if (retorno == true) {
			menuCozinha();
		} else {
			System.out.println(" Usu�rio ou senha incorretos. Tente novamente.");
			loginCozinha();
		}
	}
	
}
