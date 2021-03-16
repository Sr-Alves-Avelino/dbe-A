package loja;

import java.math.BigDecimal;

public class TestaSituacao {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		pedido.getHandler().inscrever(new EmailListener());
		pedido.getHandler().inscrever(new LogListener());
		
		pedido.abrirChamado();
		
		pedido.pagar();
		System.out.println(pedido.getSituacao());
		pedido.abrirChamado();

		pedido.entregar();
		System.out.println(pedido.getSituacao());
		pedido.abrirChamado();
		
		//pedido.reabrir();

	}
}
