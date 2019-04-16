package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	String nome;
	double preco;
	int quant;
	
	public Produto(String nome, double preco, int quant){
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}

	
}
