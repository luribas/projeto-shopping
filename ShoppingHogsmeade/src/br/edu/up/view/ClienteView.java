package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerCliente;
import br.edu.up.model.Cliente;

public class ClienteView {
	static Scanner scanner = new Scanner(System.in);
	static Cliente cliente = new Cliente();
	static Principal principal = new Principal();
	static RestauranteView restauranteView = new RestauranteView();
	static ControllerCliente controllerCliente = new ControllerCliente();

	public static void menuCliente() {
		System.out.println("\n *    MENU CLIENTE    * ");	
		System.out.println(" 1 - Login");
		System.out.println(" 2 - Cadastre-se");
		System.out.print("\n -> ");
		int op = scanner.nextInt();
		do 
		{
			switch(op) 
			{
				case 1:
					System.out.println("\n *    LOGIN    *");
					System.out.print(" Login: ");
					String login = scanner.next();
					System.out.print(" Senha: ");
					String senha = scanner.next();
					boolean retorno = controllerCliente.autenticarCliente(login, senha);
					if(retorno)
					{
						System.out.println("\n *   BEM VINDO " + cliente.getNome() + "   *");
						System.out.println(" 1 - Fazer Pedido");
						System.out.println(" 2 - Alterar Dados");
						System.out.println(" 3 - Sair");
						System.out.print("\n -> ");
						int opCliente = scanner.nextInt();
						do {
							switch(opCliente) {
								case 1 : 
									restauranteView.restaurantes();
									break;
								case 2 :
									alterarDadosCliente();
									break;
								case 3 :
									menuCliente();
									break;
								default:
									System.out.println(" Opção inválida.");
									break;
							}
						} while (opCliente>0 && opCliente<3);
					}
					break;
				case 2 : 
					cadastrarCliente();
					break;
				default:
					System.out.println(" Opção inválida. ");
					break;
			}
		} 
		while (op > 0 && op < 2);
	}

	public static void cadastrarCliente() {
		System.out.println("\n *    CADASTRAR CLIENTE    * ");
		System.out.print(" Nome: ");
		cliente.setNome(scanner.next());
		System.out.print(" Login: ");
		cliente.setLogin(scanner.next());
		System.out.print(" Senha: ");
		cliente.setSenha(scanner.next());
		controllerCliente.cadastrarCliente(cliente);
	}

	public static void alterarDadosCliente() {
		System.out.println("\n *    ALTERAR DADOS DO CLIENTE    * ");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerCliente.autenticarCliente(login, senha);
		if (retorno) {
			System.out.print(" Novo login: ");
			cliente.setLogin(scanner.next());
			System.out.print(" Nova senha: ");
			cliente.setSenha(scanner.next());
			controllerCliente.autenticarCliente(login, senha);
			if (retorno = true) {
				System.out.print(" Alterado com sucesso! ");
			}
			System.out.print(" Senha ou login incorretos! Tente novamente.");
		}
	}
}
