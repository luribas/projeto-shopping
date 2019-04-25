package br.edu.up.view;

import br.edu.up.controller.ControllerPedido;
import br.edu.up.model.Pedido;
import br.edu.up.model.Produto;

public class CozinhaView {
	static ControllerPedido controllerPedido = new ControllerPedido();
	
	// Listar pedidos ainda não entregues
	public void verPedido() {
		for (Pedido p : controllerPedido.listaDePedidos()) {
			if(p.getStatus()==0) {
				for (Produto prod : p.getListaProdPedido()) {
					System.out.println(prod.getNome());
				}
			}
		}
	}
	
}
