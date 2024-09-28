package br.mendonca.view;

import br.mendonca.model.observer.Observer;
import br.mendonca.view.composite.Component;

public class Data extends Component implements Observer {
	
	private String data = "";
	
	@Override
	public String display() {
		return data;
	}

	@Override
	public void update(String mensagem) {
		data = mensagem;
	}

}
