package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerAdministrador;
import br.edu.up.controller.ControllerPedido;
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
		System.out.println(" 1 - Ver pedidos");
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
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("caldeirao")){
								System.out.println("Produtos:");
										 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {

									System.out.println( (j+1) + " - " + controllerPedido.listaPedidos.get(i).getListaProdPedido().get(j).getNome());
								
									
								}
								System.out.println("Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("Cliente: " + controllerPedido.listaPedidos.get(i).getC());
								System.out.println("Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("Preço: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							}
						}
						break;
					case 2:
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("tres")){
								System.out.println("Produtos:");			 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {

									System.out.println( (j+1) + " - " + controllerPedido.listaPedidos.get(i).getListaProdPedido().get(j).getNome());
								}
								System.out.println("Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("Cliente: " + controllerPedido.listaPedidos.get(i).getC());
								System.out.println("Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("Preço: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							}
						}
//						 lista de pedidos tres vassouras;
						break;
					case 3:
						for (int i=0; i<controllerPedido.listaPedidos.size(); i++){
							if(controllerPedido.listaPedidos.get(i).getRestaurante().equals("javali")){
								System.out.println("Produtos:");			 
								for (int j = 0; j< controllerPedido.listaPedidos.get(i).getListaProdPedido().size(); j++) {

									System.out.println( (j+1) + " - " + controllerPedido.listaPedidos.get(i).getListaProdPedido().get(j).getNome());
								}
								System.out.println("Data: " + controllerPedido.listaPedidos.get(i).getData()); 
								System.out.println("Cliente: " + controllerPedido.listaPedidos.get(i).getC());
								System.out.println("Status: " + controllerPedido.listaPedidos.get(i).getStatus());
								System.out.println("Preço: " + controllerPedido.listaPedidos.get(i).getValorTotal());
							}
						}
						break;
//						lista de pedidos cabeça de javali;
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
