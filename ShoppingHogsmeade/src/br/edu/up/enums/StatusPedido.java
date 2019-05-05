package br.edu.up.enums;

public enum StatusPedido {
	AguardandoPagamento, //atualiza quando confirma - admin altera
	EmAberto, // cozinha tem acesso para preparar (já foi pago)
	Pronto, //cozinha atualiza - envia a senha para retirada
	Finalizado // restaurante (admin) atualiza quando o cliente retirar
}
