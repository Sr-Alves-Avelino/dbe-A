package loja.situacao;

import loja.Pedido;
import loja.StateException;

public abstract class Situacao {
	
	public abstract void abrirChamado(Pedido pedido);
	
	public void pagar(Pedido pedido) {
		throw new StateException("Não pode transitar para pago");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("Não pode transitar para entregue");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("Não pode transitar para cancelado");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("Não pode transitar para aberto");
	}


}
