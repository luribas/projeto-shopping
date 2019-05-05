package br.edu.up.model;

import java.util.Calendar;

public class Cartao {
	private Cliente c = new Cliente();
	private long numero;
	private int cvv;
	private String nomeCartao;
	private Calendar dataValidade;
	
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
}
