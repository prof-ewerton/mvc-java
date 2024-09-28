package br.mendonca.view;

import br.mendonca.controller.strategy.Strategy;
import br.mendonca.view.composite.Component;

public class Field extends Component {
	
	private Strategy strategy;
	private CapturaTecla cap;
	
	public Field(Strategy strategy) {
		this.strategy = strategy;
		cap = new CapturaTecla(this);
		cap.start();
	}

	public void setTecla(char tecla) {
		System.out.println("Tecla pressionada: " + tecla);
		if (tecla == 'x') {
			strategy.action();
		}
	}

	@Override
	public String display() {
		return "\nDigite a tecla correspondente a opção: \n";
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
