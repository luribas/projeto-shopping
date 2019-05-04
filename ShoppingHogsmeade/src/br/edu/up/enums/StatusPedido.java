package br.edu.up.enums;

public enum StatusPedido {
	AguardandoPagamento,
	EmAberto, 
	Finalizado
}
//aguardando pgto
//aberto
//pronto
//finalizado
//
// aguardando pgto - atualiza qdo confirma - admin altera
// aberto -cozinha tem acesso para preparar 
// pronto - cozinha atualiza - envia a senha para retirada
// finalizado - restaurante (admin) atualiza qdo o cliente retirar
