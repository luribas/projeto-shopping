package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerCliente;
import br.edu.up.model.Cliente;

public class ClienteView {
	static ControllerCliente controllerCliente = new ControllerCliente();
	static Scanner scanner = new Scanner(System.in);
	static Cliente cliente = new Cliente();
	static Principal principal = new Principal();
	
	public static void main(String[] args) 
	{
		int op = 0;
		do 
		{
			menu();
			System.out.println(" ");
			System.out.print(" Opção: ");
			op = scanner.nextInt();
			
			switch (op) 
			{
				case 1:
					logar();
					break;
				case 2 : 
					cadastrarCliente();
					break;
				case 3 :
					alterarDadosCliente();
					break;
				case 4 :
					principal.getClass();
					break;
				default:
					System.out.println(" Opção não encontrada. ");
					break;
			}
		} 
		while (op > 0 && op < 4);
	}
	
	public static void menu()
	{
		System.out.println(" ");
		System.out.println(" *    MENU CLIENTE    * ");
		System.out.println(" 1 - Logar");
		System.out.println(" 2 - Cadastrar Cliente");
		System.out.println(" 3 - Alterar Dados Cliente");
		System.out.println(" 4 - Sair");
	}
	
	public static void cadastrarCliente()
	{
		System.out.println(" *    CADASTRAR CLIENTE    * ");
		System.out.print(" Nome: ");
		cliente.setNome(scanner.next());
		System.out.print(" Login: ");
		cliente.setLogin(scanner.next());
		System.out.print(" Senha: ");
		cliente.setSenha(scanner.next());
		controllerCliente.cadastrarCliente(cliente);
	}
	
	public static void logar()
	{
		System.out.println(" *    LOGIN    * ");
		System.out.println(" Login: ");
		String login = scanner.next();
		System.out.println(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerCliente.autenticarCliente(login, senha);
		if (retorno)
		{
			System.out.println("Login encontrado!");
		}
		else 
		{
			System.out.println("Login ou senha incorretos!");
		}
	}
	
	public static void alterarDadosCliente()
	{
		System.out.println(" *    ALTERAR DADOS DO CLIENTE    * ");
		System.out.print(" Login: ");
		String login = scanner.next();
		System.out.print(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerCliente.autenticarCliente(login, senha);
		if(retorno)
		{
			System.out.print(" Novo login: ");
			cliente.setLogin(scanner.next());
			System.out.print(" Nova senha: ");
			cliente.setSenha(scanner.next());
			controllerCliente.autenticarCliente(login, senha);
			if(retorno = true)
			{
				System.out.print(" Alterado com sucesso! ");
			}
			System.out.print(" Senha ou login incorretos! Tente novamente.");
			menu();
		}
	}
}
