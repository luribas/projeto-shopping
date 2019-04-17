package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Produto;
import br.edu.up.model.Restaurante;

public class RestauranteView {
	List<Restaurante> listaMenu = new ArrayList<>();
	
	public List<Restaurante> restaurantes() {
		Restaurante caldeirao = new Restaurante(1, "Caldeir�o Furado", "Refei��es completas almo�o e janta");
		Restaurante tresVassoras = new Restaurante(2, "Tr�s Vassoras", "Caf� e guloseimas");
		Restaurante cabecaJavali = new Restaurante(3, "Cabe�a de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
		return listaMenu;
	}
	
	// Card�pio do Caldeir�o Furado
	public List<Produto> cardapioCaldeirao() {
		List<Produto> listaCaldeirao = new ArrayList<>();
		Produto caldeirao1 = new Produto(1, "Caldeir�o 1", 40, 2);
		Produto caldeirao2 = new Produto(2, "Caldeir�o 2", 30, 4);
		listaCaldeirao.add(caldeirao1);
		listaCaldeirao.add(caldeirao2);
		return listaCaldeirao;
	}
	
	// Card�pio do Tr�s Vassoras
	public List<Produto> cardapioVassoras() {
		List<Produto> listaTresVassoras = new ArrayList<>();
		Produto vassora1 = new Produto(1, "Vassoras", 30, 1);
		listaTresVassoras.add(vassora1);
		return listaTresVassoras;
	}
	
	// Card�pio do Cabe�a de Javali
	public List<Produto> cardapioJavali() {
		List<Produto> listaJavali = new ArrayList<>();
		Produto javali1 = new Produto(1, "Javali", 30, 1);
		listaJavali.add(javali1);
		return listaJavali; 
	}
}
