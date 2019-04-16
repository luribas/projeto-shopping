package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Cliente;

public class ControllerCliente {
	List<Cliente> listaCliente = new ArrayList<Cliente>();
	
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
			if(listaCliente.get(i).getLogin().equals(login) && listaCliente.get(i).getSenha().equals(senha))
			{
				valida = true;
				break;
			}
		}
		return valida;
	}
}
