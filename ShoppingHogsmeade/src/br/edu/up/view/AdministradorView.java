package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerAdministrador;
import br.edu.up.controller.ControllerPedido;
import br.edu.up.enums.StatusPedido;
import br.edu.up.model.Administrador;

public class AdministradorView {
	static ControllerAdministrador controllerAdministrador = new ControllerAdministrador();
	static ControllerPedido controllerPedido = new ControllerPedido();
	static Scanner scanner = new Scanner(System.in);
	static Principal principal = new Principal();
	
	
	@SuppressWarnings("static-access")
	public static void menuAdmin() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *              MENU ADMINISTRADOR                 *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" 1 - Visualizar pedidos");
		System.out.println(" 2 - Voltar ao Menu Principal");
		System.out.print("\n -> ");
		int opAdmin = scanner.nextInt();
		switch(opAdmin) {
			case 1 : 
				System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" *              SELECIONE RESTAURANTE              *");
				System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.println(" 1 - Caldeirão Furado");
				System.out.println(" 2 - Três Vassouras");
				System.out.println(" 3 - Cabeça de Javali");
				System.out.println(" 4 - Voltar ao Menu Administrador");
				System.out.print("\n -> ");
				int rest = scanner.nextInt(); 
				switch (rest)
				{
					case 1: 
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" *       VISUALIZAR PEDIDOS CALDEIRÃO FURADO       *");
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("caldeirao")){
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
							}
						}
						System.out.println("\n Digite a opção desejada: ");
						System.out.println(" 1 - Marcar pedido como Finalizado ");
						System.out.println(" 2 - Marca pedido como Em aberto");
						System.out.println(" 3 - Voltar ao menu do administrador");
						System.out.print(" -> ");
						int opPedidos;
						do {
							opPedidos = scanner.nextInt();
							switch(opPedidos) {
								case 1:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.Finalizado);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.Finalizado)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 2:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.EmAberto);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.EmAberto)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 3:
									menuAdmin();
								break;
								default:
									System.out.println(" Opção inválida. Tente novamente.");
									menuAdmin();
								break;
							}
						} while (opPedidos > 0 && opPedidos < 3);
						break;
					case 2:
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" *       VISUALIZAR PEDIDOS TRÊS VASSORAS          *");
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("tres")){
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
							}
						}
						System.out.println("\n Digite a opção desejada: ");
						System.out.println(" 1 - Marcar pedido como Finalizado ");
						System.out.println(" 2 - Marca pedido como Em aberto");
						System.out.println(" 3 - Voltar ao menu do administrador");
						System.out.print(" -> ");
						int opPedidosTres;
						do {
							opPedidosTres = scanner.nextInt();
							switch(opPedidosTres) {
								case 1:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.Finalizado);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.Finalizado)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 2:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.EmAberto);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.EmAberto)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 3:
									menuAdmin();
								break;
								default:
									System.out.println(" Opção inválida. Tente novamente.");
									menuAdmin();
								break;
							}
						} while (opPedidosTres > 0 && opPedidosTres < 3);
						break;
					case 3:
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" *       VISUALIZAR PEDIDOS CABEÇA DE JAVALI       *");
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("javali")){
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
							}
						}
						System.out.println("\n Digite a opção desejada: ");
						System.out.println(" 1 - Marcar pedido como Finalizado ");
						System.out.println(" 2 - Marca pedido como Em aberto");
						System.out.println(" 3 - Voltar ao menu do administrador");
						System.out.print(" -> ");
						int opPedidosJavali;
						do {
							opPedidosJavali = scanner.nextInt();
							switch(opPedidosJavali) {
								case 1:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.Finalizado);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.Finalizado)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 2:
									for (int j = 0; j< controllerPedido.listaPedidos.size(); j++) {
										controllerPedido.listaPedidos.get(j).setStatus(StatusPedido.EmAberto);
										if (controllerPedido.listaPedidos.get(j).getStatus().equals(StatusPedido.EmAberto)) {
											System.out.println("\n Status alterado com sucesso! ");
										} else {
											System.out.println("\n Erro ao alterar Status. Tente novamente.");
										}
									}
									menuAdmin();
								break;
								case 3:
									menuAdmin();
								break;
								default:
									System.out.println(" Opção inválida. Tente novamente.");
									menuAdmin();
								break;
							}
						} while (opPedidosJavali > 0 && opPedidosJavali < 3);
						break;
				}
				break;
			case 2 :
				principal.menuPrincipal();
				break;
			default :
				System.out.println(" Opção inválida. Tente novamente.");
				break;
		}
	}
	
	@SuppressWarnings("static-access")
	static void loginAdmin(){
		Administrador admin1 = new Administrador("admin", "admin");
		controllerAdministrador.cadastrarAdmin(admin1);
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                 LOGIN ADMINISTRADOR             *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: "); 
		String senha = scanner.next();
		boolean retorno = controllerAdministrador.autenticarAdmin(login, senha);
		if (retorno == true) {
			menuAdmin();
		} else {
			System.out.println(" Usuário ou senha incorretos. Tente novamente.");
			principal.menuPrincipal();
		}
	}
}
