package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.controller.ControllerCozinha;
import br.edu.up.controller.ControllerPedido;
import br.edu.up.enums.StatusPedido;
import br.edu.up.model.Cozinha;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

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
				System.out.println(" 1 - Caldeirão Furado");
				System.out.println(" 2 - Três Vassouras");
				System.out.println(" 3 - Cabeça de Javali");
				System.out.println(" 4 - Voltar ao Menu da Cozinha");
				System.out.print("\n -> ");
				int restOpcao = 0;
				restOpcao = scanner.nextInt(); 
				switch (restOpcao)
				{
					case 1: 
						Pedido p = new Pedido();
						if(p.getStatus() == StatusPedido.EmAberto) {
							for (int i = 0; i < controllerPedido.listaDePedidos().size(); i++) {
								System.out.println("  - " + controllerPedido.listaDePedidos().get(i).getC().getNome());
							}
						} else {
							System.out.println("\n Não foi possível ver os pedidos em aberto. Tente novamente. ");
						}
//						lista de pedidos STATUS - EM ABERTO caldeirao
//						filtrar lista por restaurante e status
//						for (int i = 0; i < controllerPedido.listaDePedidos().size(); i++ ){
//						   printar lista de pedido com cliente, produto, quantidade, SENHA (numero) e valor total por pedido
//						}
						break;
					case 2:
//						 lista de pedidos STATUS - EM ABERTO  tres vassouras;
						break;
					case 3:
//						 lista de pedidos STATUS - EM ABERTO  cabeça de javali;
						break;
					case 4 :
						menuCozinha();
						break;
					default:
						System.out.println(" Opção inválida. Tente novamente.");
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
			System.out.println(" Usuário ou senha incorretos. Tente novamente.");
			loginCozinha();
		}
	}
	
	// Listar pedidos ainda não entregues
	public void verPedido() {
		for (Pedido p : controllerPedido.listaDePedidos()) {
			if(StatusPedido.EmAberto != null) {
				for (Produto prod : p.getListaProdPedido()) {
					System.out.println(prod.getNome());
				}
			}
		}
	}
	
}
