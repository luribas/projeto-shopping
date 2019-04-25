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
		System.out.print("\n -> ");
		int opMenu = 0;
		opMenu = scanner.nextInt();
		do {
			switch (opMenu) {
				case 1:
					administradorView.loginAdmin();
					break;
				case 2:
					clienteView.menuCliente();
					break;
				case 3:
					//cozinha ainda n�o foi feito
					cozinhaView.getClass();
					break;
				default:
					System.out.println("\n Op��o inv�lida. Tente novamente.");
					break;
			}
		} while (opMenu > 0 && opMenu < 3);
	}
}
