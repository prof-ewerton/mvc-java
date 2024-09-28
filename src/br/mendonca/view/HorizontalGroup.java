package br.mendonca.view;

import java.util.ArrayList;

import br.mendonca.view.composite.Component;

public class HorizontalGroup extends Component {
	
	private ArrayList<Component> components = new ArrayList<Component>();

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		components.remove(component);
	}

	@Override
	public Component getChild(int index) {
		return components.get(index);
	}

	@Override
	public String display() {
		for (Component component : components) {
			System.out.print(component.display() + " ");
		};
		return "";
	}

}
