package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.enums.StatusPedido;

public class Pedido {
	private Cliente c = new Cliente();
	private List<Produto> listaProdPedido  = new ArrayList<>();
	private double valorTotal;
	private int senha;
	private String data;
	private StatusPedido status;
	
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public List<Produto> getListaProdPedido() {
		return listaProdPedido;
	}
	public void setListaProdPedido(List<Produto> listaProdPedido) {
		this.listaProdPedido = listaProdPedido;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenhao(int senha) {
		this.senha = senha;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
}
