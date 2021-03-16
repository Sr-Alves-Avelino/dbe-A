package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private Situacao situacao;
	private SituacaoHandler handler;
	
	public SituacaoHandler getHandler() {
		return handler;
	}

	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeDeItens = 1;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
	}

	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
		this.handler = new SituacaoHandler();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setSituacao(Situacao situacao) {
		this.handler.notificar(this);
		this.situacao = situacao;
	}

	public void pagar() {
		this.situacao.pagar(this);
	}

	public void entregar() {
		this.situacao.entregar(this);
	}

	public void cancelar() {
		this.situacao.cancelar(this);
	}

	public void reabrir() {
		this.situacao.reabrir(this);
	}

	public Situacao getSituacao() {
		return situacao;
	}
	
	

}
