package br.edu.up.model;

public class Produto {
	private int idProduto;
	private String nome;
	private double preco;
	
	// Construtor
	public Produto(int idProduto, String nome, double preco){
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
	}
	
	// Getters e Setters
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
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
}
