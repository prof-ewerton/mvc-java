package br.mendonca.view.composite;

public abstract class Component {

	public void add(Component component) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}
	
	public Component getChild(int index) {
		throw new UnsupportedOperationException();
	}
	
	public String display() {
		throw new UnsupportedOperationException();
	}
	
	public void messageExit(String msg) {
		throw new UnsupportedOperationException();
	}
}
