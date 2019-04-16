package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Restaurante;

public class RestauranteView {
	static List<Restaurante> listaMenu = new ArrayList<>();
	
	public void restaurantes() {
		Restaurante caldeirao = new Restaurante("Caldeirão Furado", "Refeições completas almoço e janta");
		Restaurante tresVassoras = new Restaurante("Três Vassoras", "Café e guloseimas");
		Restaurante cabecaJavali = new Restaurante("Cabeça de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
	}
}
