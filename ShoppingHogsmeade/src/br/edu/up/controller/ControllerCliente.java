package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.model.Cliente;

public class ControllerCliente {
	public List<Cliente> listaCliente = new ArrayList<Cliente>();
	static Scanner scanner = new Scanner(System.in);
	
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

	
	public void alterarDados(String login)
	{
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(" *              ALTERAR DADOS DO CLIENTE           * ");
		System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * *");
		for (int i = 0; i < listaCliente.size(); i++) 
		{
			if(listaCliente.get(i).getLogin().equals(login))
			{
					System.out.print("\n Nome: ");
					listaCliente.get(i).setNome(scanner.next());
					System.out.print(" Sobrenome: ");
					listaCliente.get(i).setSobrenome(scanner.next());
					System.out.print(" E-mail: ");
					listaCliente.get(i).setEmail(scanner.next());
					System.out.print(" CPF: ");
					listaCliente.get(i).setCpf(scanner.next());
					System.out.print(" Telefone: ");
					listaCliente.get(i).setTelefone(scanner.next());
					System.out.print(" Novo login: ");
					listaCliente.get(i).setLogin(scanner.next());
					System.out.print(" Nova senha: ");
					listaCliente.get(i).setSenha(scanner.next());
					
					System.out.print("\n Dados alterados com sucesso! ");
				} else {
					System.out.print(" Oooops.");
				}
			}
		}
	}