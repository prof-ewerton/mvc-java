package br.mendonca.controller;

import br.mendonca.controller.strategy.Strategy;
import br.mendonca.view.composite.Component;

public class ServiceExit2 implements Strategy {

	private Component view;

	public ServiceExit2(Component component) {
		super();
		this.view = component;
	}
	@Override
	public void action() {
		view.messageExit("Concluído!");
		System.exit(0);
	}
}
