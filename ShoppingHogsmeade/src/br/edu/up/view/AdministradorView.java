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
								System.out.println("Produtos:" + controllerPedido.listaPedidos.get(i).getListaProdPedido());
								System.out.println("Data: " + controllerPedido.listaPedidos.get(i).getData());
								System.out.println("");
							}
	//						+ listaVassoras.get(i).getIdProduto() 
	
							//lista de pedidos caldeirao
	//						 filtrar lista por restaurante				
	//						for (int i = 0; i < LISTA FILTRADA.size(); i++ ){
	//						   printar lista de pedidos com cliente, produto, quantidade e valor total por pedido
	//						 }
						}
						break;
					case 2:
//						 lista de pedidos tres vassouras;
						break;
					case 3:
//						 lista de pedidos cabeça de javali;
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
		}
	}
}
