package hw2_Composition;

import java.util.ArrayList;

public class Composition {

	public Composition() {

	}

	private ArrayList<Component> component = new ArrayList<Component>();

	public void input(Component c) {
		component.add(c);
	}

	public void printComponent() {
		for (Component c : component) {
			System.out.println(c.getInput());
		}
	}

	public void algorithm(Algorithm a) {
		a.myAlgorithm();
	}
}
