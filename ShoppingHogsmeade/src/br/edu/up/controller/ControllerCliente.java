package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.model.Cliente;
import br.edu.up.view.ClienteView;

public class ControllerCliente {
	public List<Cliente> listaCliente = new ArrayList<Cliente>();
	static Scanner scanner = new Scanner(System.in);
	static ClienteView cv= new ClienteView();
	
	public void cadastrarCliente(Cliente cliente)
	{
		listaCliente.add(cliente);
	}
	
	public List<Cliente> listarCliente()
	{
		return listaCliente;
	}
	
	public boolean autenticarCliente(String login, String senha)
	{
		boolean valida = false;
		for (int i = 0; i < listaCliente.size(); i++) 
		{
			if(listaCliente.get(i).getLogin().equals(login) && listaCliente.get(i).getSenha().equals(senha) ||
					listaCliente.get(i).getEmail().equals(login) && listaCliente.get(i).getSenha().equals(senha)	)
			{
				valida = true;
				break;
			}
		}
		return valida;
	}

	
	@SuppressWarnings("static-access")
	public void alterarDados(String login)
	{
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *              ALTERAR DADOS DO CLIENTE           * ");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		for (int i = 0; i < listaCliente.size(); i++) 
		{
			if(listaCliente.get(i).getLogin().equals(login))
			{

				System.out.print(" Novo Login: ");
				String loginNovo = scanner.next();
				System.out.print(" Novo E-mail: ");
				String email = scanner.next();
				
				boolean valida = conferirCad(loginNovo, email); 
				
				if (valida) {
					System.out.println("\n Email ou Usuário já cadastrado!");		
				} else {
					listaCliente.get(i).setLogin(loginNovo);
					listaCliente.get(i).setEmail(email);
					System.out.print("\n Novo Nome: ");
					listaCliente.get(i).setNome(scanner.next());
					System.out.print("Novo Sobrenome: ");
					listaCliente.get(i).setSobrenome(scanner.next());
					System.out.print("Novo CPF: ");
					listaCliente.get(i).setCpf(scanner.next());
					System.out.print("Novo Telefone: ");
					listaCliente.get(i).setTelefone(scanner.next());
					System.out.print(" Nova senha: ");
					listaCliente.get(i).setSenha(scanner.next());
					
					System.out.print("\n Dados alterados com sucesso! ");
					cv.menuCliente();
				}
			}
		}
	}
	
	public boolean conferirCad(String login, String email) {
		boolean existe = false;
		for (int i=0; i<listaCliente.size(); i++) {
			if (listaCliente.get(i).getLogin().equals(login) 
					|| listaCliente.get(i).getEmail().equals(email) )
			{
				existe = true;
			} 		
		}
		return existe;
	}
	
	
}