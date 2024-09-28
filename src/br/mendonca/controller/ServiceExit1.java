package br.mendonca.controller;

import br.mendonca.controller.strategy.Strategy;
import br.mendonca.view.composite.Component;

public class ServiceExit1 implements Strategy {
	
	private Component view;

	public ServiceExit1(Component component) {
		super();
		this.view = component;
	}
	
	@Override
	public void action() {
		view.messageExit("Deseja sair do sistema? (pressione x novamente para sair)");
	}

}
