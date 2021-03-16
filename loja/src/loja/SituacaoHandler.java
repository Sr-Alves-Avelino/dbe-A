package loja;

import java.util.ArrayList;
import java.util.List;

public class SituacaoHandler {
	private List<Listener> listeners;
	
	public SituacaoHandler() {
		this.listeners = new ArrayList<Listener>();
	}
	
	public void inscrever(Listener listener) {
		listeners.add(listener);
	}
	
	public void desisncrever(Listener listener) {
		listeners.remove(listener);
	}
	
	public void notificar(Pedido pedido) {
		listeners.forEach(listener -> listener.update(pedido));
	}
	
}
