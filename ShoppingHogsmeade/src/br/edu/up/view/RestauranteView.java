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
		Produto peixe = new Produto(1, "Peixe com batatas", 10.90);
		Produto torta = new Produto(2, "Torta de carne moída e vegetais", 20);
		Produto sanduiche = new Produto(3, "Sanduíche de peito de frango", 7.90);
		Produto sopa = new Produto(4, "Sopa de carne e legumes", 10);
		Produto cerveja = new Produto(5, "Cerveja Amanteigada", 7.50);
		Produto coca = new Produto(6, "Coca-Cola 600ml", 5);
		Produto suco = new Produto(7, "Suco de Abóbora", 6);
		listaCaldeirao.add(peixe);
		listaCaldeirao.add(torta);
		listaCaldeirao.add(sanduiche);
		listaCaldeirao.add(sopa);
		listaCaldeirao.add(cerveja);
		listaCaldeirao.add(coca);
		listaCaldeirao.add(suco);
		return listaCaldeirao;
	}
	
	// Cardápio do Três Vassoras
	public List<Produto> cardapioVassoras() {
		List<Produto> listaTresVassoras = new ArrayList<>();
		Produto cafeP = new Produto(1, "Café Pequeno", 2);
		Produto cafeM = new Produto(2, "Café Médio", 3);
		Produto cafeG = new Produto(3, "Café Grande", 4);
		Produto panqueca = new Produto(4, "Panqueca (porção com 3)", 4);
		Produto bacon = new Produto(5, "Bacon (porção com 3)", 3);
		Produto ovos = new Produto(6, "Ovos (2 ovos)", 2);
		Produto sucos = new Produto(7, "Sucos", 5);
		Produto bolo = new Produto(8, "Bolo de chocolate", 5.50);
		Produto pao = new Produto(8, "Pão de queijo (5 unidades)", 5);
		listaTresVassoras.add(cafeP);
		listaTresVassoras.add(cafeM);
		listaTresVassoras.add(cafeG);
		listaTresVassoras.add(panqueca);
		listaTresVassoras.add(bacon);
		listaTresVassoras.add(ovos);
		listaTresVassoras.add(sucos);
		listaTresVassoras.add(bolo);
		listaTresVassoras.add(pao);
		return listaTresVassoras;
	}
	
	// Cardápio do Cabeça de Javali
	public List<Produto> cardapioJavali() {
		List<Produto> listaJavali = new ArrayList<>();
		Produto cerveja = new Produto(1, "Cerveja", 5);
		Produto cervejaA = new Produto(2, "Cerveja Amanteigada", 7);
		Produto whiskey = new Produto(3, "Whiskey", 20);
		Produto rodizio = new Produto(4, "Rodízio de Churrasco (por pessoa)", 30);
		listaJavali.add(cerveja);
		listaJavali.add(cervejaA);
		listaJavali.add(whiskey);
		listaJavali.add(rodizio);
		return listaJavali; 
	}
}
