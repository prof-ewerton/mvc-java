package br.mendonca.view;

import br.mendonca.controller.ServiceExit1;
import br.mendonca.controller.ServiceExit2;
import br.mendonca.model.observer.Observer;
import br.mendonca.model.observer.Subject;
import br.mendonca.view.composite.Component;

public class Tela extends Component implements Observer {
	
	private VerticalGroup v = new VerticalGroup();
	private Field f;
	private Message msg;
	
	public Tela(Subject subject) {		
		HorizontalGroup h1 = new HorizontalGroup();
		v.add(h1);
		
		Title t1 = new Title();
		h1.add(t1);
		Title t2 = new Title();
		h1.add(t2);
		Title t3 = new Title();
		h1.add(t3);
		
		HorizontalGroup h2 = new HorizontalGroup();
		v.add(h2);
		
		Menu m = new Menu();
		h2.add(m);
		
		Data dt = new Data();
		h2.add(dt);
		
		subject.add(dt);
		subject.add(this);
		
		f = new Field(new ServiceExit1(this));
		h2.add(f);
		
		msg = new Message();
		h2.add(msg);
		
		show(v);
	}

	public void show(Component component) {
		component.display();
	}

	@Override
	public void update(String mensagem) {
		this.show(v);
	}

	@Override
	public void messageExit(String string) {
		msg.setMessage(string);
		show(v);
		// Exemplo de troca de estratégia dinamicamente.
		f.setStrategy(new ServiceExit2(this));
	}
}
