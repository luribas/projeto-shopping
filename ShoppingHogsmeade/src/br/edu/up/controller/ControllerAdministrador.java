package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Administrador;


public class ControllerAdministrador {

	List<Administrador> listaAdministrador = new ArrayList<Administrador>();

	public void cadastrarAdmin (Administrador administrador){
		listaAdministrador.add(administrador);
	}
	
	public boolean autenticarAdmin (String login, String senha) {
		boolean valida = false;
		for (int i = 0; i < listaAdministrador.size(); i++) 
		{
			if(listaAdministrador.get(i).getLogin().equals(login) && listaAdministrador.get(i).getSenha().equals(senha))
			{
				valida = true;
				break;
			}
		}
		return valida;
	}
}
