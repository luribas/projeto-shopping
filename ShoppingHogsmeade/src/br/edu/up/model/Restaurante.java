package br.edu.up.model;

public class Restaurante {
	private int idRestaurante;
	private String nome;
	private String detalhes;
	
	// Construtor
	public Restaurante(int idRestaurante, String nome, String detalhes) {
		this.idRestaurante = idRestaurante;
		this.nome = nome;
		this.detalhes = detalhes;
	}
	
	// Getters e Setters
	public int getIdRestaurante() {
		return idRestaurante;
	}
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
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
