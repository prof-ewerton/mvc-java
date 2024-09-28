package br.mendonca.view;

import br.mendonca.view.composite.Component;

public class Message extends Component {
	
	private String message = ".";

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String display() {
		return message;
	}

}
