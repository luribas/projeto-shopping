package br.edu.up.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Restaurante;

public class RestauranteView {
	static List<Restaurante> listaMenu = new ArrayList<>();
	
	public void restaurantes() {
		Restaurante caldeirao = new Restaurante("Caldeir�o Furado", "Refei��es completas almo�o e janta");
		Restaurante tresVassoras = new Restaurante("Tr�s Vassoras", "Caf� e guloseimas");
		Restaurante cabecaJavali = new Restaurante("Cabe�a de Javali", "Taverna e Churrascaria");
		
		listaMenu.add(caldeirao);
		listaMenu.add(tresVassoras);
		listaMenu.add(cabecaJavali);
	}
}
