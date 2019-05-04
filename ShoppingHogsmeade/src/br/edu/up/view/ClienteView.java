package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.controller.ControllerCliente;
import br.edu.up.controller.ControllerPedido;
import br.edu.up.model.Cliente;
import br.edu.up.model.Produto;
import br.edu.up.model.Restaurante;

public class ClienteView {
	static Scanner scanner = new Scanner(System.in);
	static Cliente cliente = new Cliente();
	static Principal principal = new Principal();
	static RestauranteView restauranteView = new RestauranteView();
	static ControllerCliente controllerCliente = new ControllerCliente();
	static ControllerPedido controllerPedido = new ControllerPedido();

	@SuppressWarnings("static-access")
	public void menuCliente() {
		
		int op;
		do 
		{
			System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println(" *                 MENU CLIENTE                    * ");
			System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println(" 1 - Login");
			System.out.println(" 2 - Cadastre-se");
			System.out.println(" 3 - Voltar ao menu principal");
			System.out.print("\n -> ");
			 op = scanner.nextInt();
			switch(op) 
			{
				case 1:
					System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println(" *                  LOGIN                          *");
					System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println(" Insira Login ou E-mail e sua Senha para acessar.");
					System.out.print(" Login: ");
					String login = scanner.next();
					System.out.print(" Senha: ");
					String senha = scanner.next();
					boolean retorno = controllerCliente.autenticarCliente(login, senha);
					if(retorno)
					{
						System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("              BEM VINDO(A) " + cliente.getNome());
						System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println(" 1 - Fazer Pedido");
						System.out.println(" 2 - Alterar Dados");
						System.out.println(" 3 - Visualizar Dados");
						System.out.println(" 4 - Voltar à Área do Cliente");
						System.out.print("\n -> ");
						int opCliente = scanner.nextInt();
							switch(opCliente) {
								case 1 : 
									System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
									System.out.println(" *                  RESTAURANTES                   *");
									System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
									List<Restaurante> listaRestaurante = restauranteView.restaurantes();
									for(int i=0; i<listaRestaurante.size(); i++)
									{
										System.out.println("\n "
														  + listaRestaurante.get(i).getIdRestaurante()
														  + " - "
														  + listaRestaurante.get(i).getNome() 
														  + ":\n    "
													      + listaRestaurante.get(i).getDetalhes());
									}
									System.out.print("\n Digite a opção desejada: " + "\n -> ");
									int opResta = scanner.nextInt();
										switch (opResta) {
											case 1 :
												List<Produto> listaCaldeirao = restauranteView.cardapioCaldeirao();
												System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
												System.out.println(" *           CARDÁPIO CALDEIRÃO FURADO             *");
												System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
												
												System.out.println(" 0 - Finalizar");
												for(int i=0; i<listaCaldeirao.size(); i++)
												{
													System.out.println(" "
																	 + listaCaldeirao.get(i).getIdProduto() 
																	 + " - "
															         + listaCaldeirao.get(i).getNome()
															         + " / R$"
																	 + listaCaldeirao.get(i).getPreco());
												}
												System.out.println("\n Digite o(s) ID(s) do(s) produto(s): ");
												int id;
												do {
													System.out.print("\n -> ");
													id = scanner.nextInt();
													if (id != 0) {
														controllerPedido.cadastrarCarrinhoCompra(listaCaldeirao.get(id-1));
													}
												} while(id > 0);
												controllerPedido.finalizarPedido(cliente);
												if (controllerPedido.listaDePedidos().size() > 0) {
<<<<<<< HEAD
													System.out.println("entra no if");
													for (int i = 0; i < controllerPedido.listaDePedidos().size(); i++ ) {
														controllerPedido.finalizarPedido(cliente);
														System.out.println("Produdo: " + controllerPedido.listaDePedidos()
																   .get(controllerPedido.listaDePedidos()
																   .size()-1).getListaProdPedido().get(0).getNome()
																   + "\n Valor: R$ "); 
													}
												}else {
													System.out.println("LISTA NULA!");
=======
													
												} else {
													System.out.println("\n Erro ao realizar o pedido. Tente novamente.");
>>>>>>> 1fa4bc3152a90fa8c97d2f65f92e6a428a856a10
												}
												break;
											case 2 :
												System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
												System.out.println(" *              CARDÁPIO TRÊS VASSORAS             *");
												System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
												List<Produto> listaVassoras = restauranteView.cardapioVassoras();
												System.out.println(" 0 - Finalizar");
												for(int i=0; i<listaVassoras.size(); i++)
												{
													System.out.println(" "
																	 + listaVassoras.get(i).getIdProduto() 
																	 + " - "
															         + listaVassoras.get(i).getNome()
															         + " / R$"
																	 + listaVassoras.get(i).getPreco());
												}
												System.out.println("\n Digite o(s) ID(s) do(s) produto(s): ");
												do {
													System.out.print("\n -> ");
													id = scanner.nextInt();
													if (id != 0) {
														controllerPedido.cadastrarCarrinhoCompra(listaVassoras.get(id-1));
													}
												} while(id > 0);
												controllerPedido.finalizarPedido(cliente);
												if (controllerPedido.listaDePedidos().size() > 0) {
													
												} else {
													System.out.println("\n Erro ao realizar o pedido. Tente novamente.");
												}
												break;
											case 3 :
												System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
												System.out.println(" *           CARDÁPIO CABEÇA DE JAVALI             *");
												System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
												List<Produto> listaJavali = restauranteView.cardapioJavali();
												System.out.println(" 0 - Finalizar");
												for(int i=0; i<listaJavali.size(); i++)
												{
													System.out.println(" "
																	 + listaJavali.get(i).getIdProduto() 
																	 + " - "
															         + listaJavali.get(i).getNome()
															         + " / R$"
																	 + listaJavali.get(i).getPreco());
												}
												System.out.println("\n Digite o(s) ID(s) do(s) produto(s): ");
												do {
													System.out.print("\n -> ");
													id = scanner.nextInt();
													if (id != 0) {
														controllerPedido.cadastrarCarrinhoCompra(listaJavali.get(id-1));
													}
												} while(id > 0);
												controllerPedido.finalizarPedido(cliente);
												if (controllerPedido.listaDePedidos().size() > 0) {
													
												} else {
													System.out.println("\n Erro ao realizar o pedido. Tente novamente.");
												}
												break;
										}
									break;
								case 2 :
									alterarDadosCliente();
									menuCliente();
									break;
								case 3 :
									visualizarDadosCliente();
									break;
								case 4:
									menuCliente();
								default:
									System.out.println(" Opção inválida.");
									break;
							}
					} else {
						System.out.println(" Usuário ou senha incorretos. Tente novamente.");
						menuCliente();
					}
					break;
				case 2 : 
					cadastrarCliente();
					break;
				case 3 :
					principal.menuPrincipal();
					break;
				default:
					System.out.println(" Opção inválida. ");
					break;
			}
		} 
		while (op > 0 && op < 3);
	}
	
	public static void cadastrarCliente() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *               CADASTRAR CLIENTE                 * ");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print(" Nome: ");
		cliente.setNome(scanner.next());
		System.out.print(" Sobrenome: ");
		cliente.setSobrenome(scanner.next());
		System.out.print(" E-mail: ");
		cliente.setEmail(scanner.next());
		System.out.print(" CPF: ");
		cliente.setCpf(scanner.next());
		System.out.print(" Telefone: ");
		cliente.setTelefone(scanner.next());
		System.out.print(" Login: ");
		cliente.setLogin(scanner.next());
		System.out.print(" Senha: ");
		cliente.setSenha(scanner.next());
		controllerCliente.cadastrarCliente(cliente);
	}

	public static void alterarDadosCliente() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *              ALTERAR DADOS DO CLIENTE           * ");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" Insira Login ou E-mail e sua Senha para poder alterar os dados.");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerCliente.autenticarCliente(login, senha);
		if (retorno) {
			System.out.print(" Nome: ");
			cliente.setNome(scanner.next());
			System.out.print(" Sobrenome: ");
			cliente.setSobrenome(scanner.next());
			System.out.print(" E-mail: ");
			cliente.setEmail(scanner.next());
			System.out.print(" CPF: ");
			cliente.setCpf(scanner.next());
			System.out.print(" Telefone: ");
			cliente.setTelefone(scanner.next());
			System.out.print(" Novo login: ");
			cliente.setLogin(scanner.next());
			System.out.print(" Nova senha: ");
			cliente.setSenha(scanner.next());
			controllerCliente.autenticarCliente(login, senha);
			if (retorno = true) {
				System.out.print(" Alterado com sucesso! ");
			}
		} else {
			System.out.print(" Senha ou login incorretos! Tente novamente.");
		}
	}
	
	public static void visualizarDadosCliente() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *            VISUALIZAR DADOS DO CLIENTE          * ");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" Insira Login ou E-mail e sua Senha para poder visualizar os dados.");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerCliente.autenticarCliente(login, senha);
		if (retorno) {
			System.out.print(" Nome: ");
			cliente.getNome();
			System.out.print(" Sobrenome: ");
			cliente.getSobrenome();
			System.out.print(" E-mail: ");
			cliente.getEmail();
			System.out.print(" CPF: ");
			cliente.getCpf();
			System.out.print(" Telefone: ");
			cliente.getTelefone();
			System.out.print(" Login: ");
			cliente.getLogin();
			System.out.print(" Senha: ");
			cliente.getSenha();
		} else {
			System.out.print(" Senha ou login incorretos! Tente novamente.");
		}
	}
}
