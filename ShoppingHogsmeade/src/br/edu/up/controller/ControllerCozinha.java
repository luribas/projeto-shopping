package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Cozinha;

public class ControllerCozinha {
	List<Cozinha> listaCozinha = new ArrayList<Cozinha>();
	
	public void cadastrarCozinha(Cozinha cozinha)
	{
		listaCozinha.add(cozinha);
	}
	
	public boolean autenticarCozinha(String login, String senha) {
		boolean valida = false;
		for (int i = 0; i < listaCozinha.size(); i++) 
		{
			if(listaCozinha.get(i).getLogin().equals(login) && 
					listaCozinha.get(i).getSenha().equals(senha))
			{
				valida = true;
				break;
			}
		}
		return valida;
	} 
}
