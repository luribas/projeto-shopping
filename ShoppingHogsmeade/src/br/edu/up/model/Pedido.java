package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.enums.StatusPedido;

public class Pedido {
	private List<Produto> listaProdPedido  = new ArrayList<>();
	private double valorTotal;
	private int senhaPedido;
	private String data;
	private StatusPedido status;
	private String restaurante;
	
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
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
	public int getSenhaPedido() {
		return senhaPedido;
	}
	public void setSenhaPedido(int senhaPedido) {
		this.senhaPedido = senhaPedido;
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
