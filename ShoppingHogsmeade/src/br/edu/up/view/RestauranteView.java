package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Produto;
import br.edu.up.model.Restaurante;

public class RestauranteView {
	List<Restaurante> listaMenu = new ArrayList<Restaurante>();
	
	public List<Restaurante> restaurantes() {
		Restaurante caldeirao = new Restaurante("Caldeirão Furado", "Refeições completas almoço e janta");
		Restaurante tresVassoras = new Restaurante("Três Vassoras", "Café e guloseimas");
		Restaurante cabecaJavali = new Restaurante("Cabeça de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
		
		return listaMenu;
	}
	
	public static void cardapio() {
		// Cardápio do Caldeirão Furado
		List<Produto> listaCaldeirao = new ArrayList<>();
		Produto caldeirao1 = new Produto("Caldeirão 1", 40, 2);
		listaCaldeirao.add(caldeirao1);	
		
		// Cardápio do Três Vassoras
		List<Produto> listaTresVassoras = new ArrayList<>();
		Produto vassora1 = new Produto("Vassoras", 30, 1);
		listaTresVassoras.add(vassora1);
		
		// Cardápio do Cabeça de Javali
		List<Produto> listaJavali = new ArrayList<>();
		Produto javali1 = new Produto("Javali", 30, 1);
		listaJavali.add(javali1);
		
	}
}
