package loja.situacao;

import loja.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado para pos venda");
	}

}
