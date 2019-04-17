package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Produto;
import br.edu.up.model.Restaurante;

public class RestauranteView {
	List<Restaurante> listaMenu = new ArrayList<Restaurante>();
	
	public List<Restaurante> restaurantes() {
		Restaurante caldeirao = new Restaurante("Caldeir�o Furado", "Refei��es completas almo�o e janta");
		Restaurante tresVassoras = new Restaurante("Tr�s Vassoras", "Caf� e guloseimas");
		Restaurante cabecaJavali = new Restaurante("Cabe�a de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
		
		return listaMenu;
	}
	
	public static void cardapio() {
		// Card�pio do Caldeir�o Furado
		List<Produto> listaCaldeirao = new ArrayList<>();
		Produto caldeirao1 = new Produto("Caldeir�o 1", 40, 2);
		listaCaldeirao.add(caldeirao1);	
		
		// Card�pio do Tr�s Vassoras
		List<Produto> listaTresVassoras = new ArrayList<>();
		Produto vassora1 = new Produto("Vassoras", 30, 1);
		listaTresVassoras.add(vassora1);
		
		// Card�pio do Cabe�a de Javali
		List<Produto> listaJavali = new ArrayList<>();
		Produto javali1 = new Produto("Javali", 30, 1);
		listaJavali.add(javali1);
		
	}
}
