package br.mendonca.view;

import java.io.IOException;

public class CapturaTecla extends Thread {
	
	private final Field field;

	public CapturaTecla(Field field) {
		super();
		this.field = field;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (System.in.available() > 0) {
					char tecla = (char) System.in.read();
					field.setTecla(tecla);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
