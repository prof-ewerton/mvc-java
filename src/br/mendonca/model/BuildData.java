package br.mendonca.model;

import java.util.List;
import java.util.Vector;

import br.mendonca.model.observer.Observer;
import br.mendonca.model.observer.Subject;

public class BuildData extends Thread implements Subject{
	
	private String[] mensagens = {
	        "Mensagem 1: Olá mundo!",
	        "Mensagem 2: Como vai você?",
	        "Mensagem 3: Espero que tenha um ótimo dia!",
	        "Mensagem 4: Continue se esforçando!",
	        "Mensagem 5: Até a próxima!"
	};
	
	private String mensagemAtual = "";

	public String getMensagem() {
		return mensagemAtual;
	}
	
	// Singleton
	private static BuildData instance = new BuildData();
	
	private BuildData() { }
	
	public static BuildData getInstance() {
		if (instance == null) {
			instance = new BuildData();
		}
		return instance;
	}
	// end Singleton
	

	@Override
	public void run() {
		for (String mensagem : mensagens) {
            try {
                Thread.sleep(5000);
                mensagemAtual = mensagemAtual + "\n" + mensagem;
                notifier();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
	
	
	
	private List<Observer> observers = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifier() {
		for (Observer o : observers) {
			o.update(mensagemAtual);
		}
	}
}
