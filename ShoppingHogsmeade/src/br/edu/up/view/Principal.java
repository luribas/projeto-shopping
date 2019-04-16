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

	static public void menuPrincipal() {
		System.out.println("\n *    MENU    *");
		System.out.println(" 1 - Área Administrador");
		System.out.println(" 2 - Área Cliente");
		System.out.println(" 3 - Área Cozinha");
		System.out.print("\n -> ");
		int opMenu = 0;
		opMenu = scanner.nextInt();
		do {
			switch (opMenu) {
				case 1:
					administradorView.getClass();
					break;
				case 2:
					clienteView.menuCliente();
					break;
				case 3:
					cozinhaView.getClass();
					break;
				default:
					System.out.println("\n Opção inválida. Tente novamente.");
					break;
			}
		} while (opMenu > 0 && opMenu < 3);
	}
}
