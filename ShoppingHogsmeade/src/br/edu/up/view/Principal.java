package br.edu.up.view;

import java.util.Scanner;

public class Principal {
	static Scanner scanner = new Scanner(System.in);
	static ClienteView clienteView = new ClienteView();

	public static void main(String[] args) {
		menu();
		int opMenu = scanner.nextInt();

		do {
			switch (opMenu) {
				case 1:
					
					break;
				case 2:
					clienteView.getClass();
					break;
				case 3:
					
					break;
				default:
					System.out.println("\n Opção inválida. Tente novamente.");
					break;
			}
		} while (opMenu > 0);
	}

	static public void menu() {
		System.out.println("\n *    MENU    *");
		System.out.println(" 1 - Área Administrador");
		System.out.println(" 2 - Área Cliente");
		System.out.println(" 3 - Área Cozinha");
	}
}
