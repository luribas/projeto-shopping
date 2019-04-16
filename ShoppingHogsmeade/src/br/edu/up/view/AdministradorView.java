package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerAdministrador;
import br.edu.up.model.Administrador;


public class AdministradorView {

	static ControllerAdministrador controllerAdministrador = new ControllerAdministrador();
	static Scanner scanner = new Scanner(System.in);
	static Administrador administrador = new Administrador();
	static Principal principal = new Principal();	
	
	
	
	static void loginAdmin(){
		
		System.out.println("LOGIN ADMIN:");
		System.out.println(" Login: ");
		String login = scanner.next();
		System.out.println(" Senha: ");
		String senha = scanner.next();
		boolean retorno = controllerAdministrador.autenticarAdmin(login, senha);
		if (retorno)
		{
			menuAdmin();
		}
		else 
		{
			System.out.println("Login ou senha incorretos!");
		}
		
	}

	private static void menuAdmin() {
		System.out.println("* MENU ADMIN *");
		System.out.println("1 - Ver pedidos");
		System.out.println("2 - Cozinha");
		
	}
	
	
}
