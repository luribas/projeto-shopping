package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ControllerAdministrador;
import br.edu.up.model.Administrador;

public class AdministradorView {
	static ControllerAdministrador controllerAdministrador = new ControllerAdministrador();
	static Scanner scanner = new Scanner(System.in);
	static Principal principal = new Principal();	
	
	@SuppressWarnings("static-access")
	public static void menuAdmin() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *              MENU ADMINISTRADOR                 *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" 1 - Ver pedidos");
		System.out.println(" 2 - Cozinha");
		System.out.println(" 3 - Voltar ao Menu Principal");
		System.out.print("\n -> ");
		int opAdmin = scanner.nextInt();
		switch(opAdmin) {
			case 1 : 
				
				break;
			case 2 :
				
				break;
			case 3 :
				principal.menuPrincipal();
				break;
			default :
				System.out.println(" Opção inválida. Tente novamente.");
				menuAdmin();
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
			loginAdmin();
		}
	}
}
