package br.edu.up.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.up.enums.StatusPedido;

public class Pedido {
	private Cliente c = new Cliente();
	private List<Produto> listaProdPedido  = new ArrayList<>();
	private double valorTotal;
	private int numero;
	private Date data;
	private StatusPedido statusPedido;
	private int quantidade;
	
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public StatusPedido getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
