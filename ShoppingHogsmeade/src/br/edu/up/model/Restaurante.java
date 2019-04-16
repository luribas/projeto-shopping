package br.edu.up.model;

public class Restaurante {
	private String nome;
	private String detalhes;
	
	public Restaurante(String nome, String detalhes) {
		this.nome = nome;
		this.detalhes = detalhes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
}
