package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Produto;
import br.edu.up.model.Restaurante;

public class RestauranteView {
	List<Restaurante> listaMenu = new ArrayList<>();
	
	public List<Restaurante> restaurantes() {
		Restaurante caldeirao = new Restaurante(1, "Caldeirão Furado", "Refeições completas almoço e janta");
		Restaurante tresVassoras = new Restaurante(2, "Três Vassoras", "Café e guloseimas");
		Restaurante cabecaJavali = new Restaurante(3, "Cabeça de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
		return listaMenu;
	}
	
	// Cardápio do Caldeirão Furado
	public List<Produto> cardapioCaldeirao() {
		List<Produto> listaCaldeirao = new ArrayList<>();
		Produto caldeirao1 = new Produto(1, "Caldeirão 1", 40, 2);
		Produto caldeirao2 = new Produto(2, "Caldeirão 2", 30, 4);
		listaCaldeirao.add(caldeirao1);
		listaCaldeirao.add(caldeirao2);
		return listaCaldeirao;
	}
	
	// Cardápio do Três Vassoras
	public List<Produto> cardapioVassoras() {
		List<Produto> listaTresVassoras = new ArrayList<>();
		Produto vassora1 = new Produto(1, "Vassoras", 30, 1);
		listaTresVassoras.add(vassora1);
		return listaTresVassoras;
	}
	
	// Cardápio do Cabeça de Javali
	public List<Produto> cardapioJavali() {
		List<Produto> listaJavali = new ArrayList<>();
		Produto javali1 = new Produto(1, "Javali", 30, 1);
		listaJavali.add(javali1);
		return listaJavali; 
	}
}
