package br.edu.up.view;

import java.util.Scanner;

public class Principal {
	static Scanner scanner = new Scanner(System.in);
	static ClienteView clienteView = new ClienteView();
	static CozinhaView cozinhaView = new CozinhaView();
	static AdministradorView administradorView = new AdministradorView(); 

	public static void main(String[] args) {
		menuPrincipal();
	}

	@SuppressWarnings("static-access")
	static public void menuPrincipal() {
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *                   MENU PRINCIPAL                *");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" 1 - �rea Administrador");
		System.out.println(" 2 - �rea Cliente");
		System.out.println(" 3 - �rea Cozinha");
		System.out.println(" 4 - Sair");
		System.out.print("\n -> ");
		int opMenu = 0;
			
		do {
			opMenu = scanner.nextInt();
				switch (opMenu) {
				case 1:
					administradorView.loginAdmin();
					break;
				case 2:
					clienteView.menuCliente();
					break;
				case 3:
					cozinhaView.loginCozinha();
					break;
				case 4:
					System.out.println(" \n Fim do programa. ");
					break;
				default:
					System.out.println("\n Op��o inv�lida. Tente novamente.");
					menuPrincipal();
					break;
			}	
		} while (opMenu > 0 && opMenu < 4);

	}
}
