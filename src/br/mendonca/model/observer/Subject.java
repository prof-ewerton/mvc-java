package br.mendonca.model.observer;

public interface Subject {

	void add(Observer observer);
	void remove(Observer observer);
	
	void notifier();
}
