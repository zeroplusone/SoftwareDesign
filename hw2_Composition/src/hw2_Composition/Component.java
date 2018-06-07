package hw2_Composition;

public class Component {

	private int natual;
	private int stretchability;
	private int shrinkability;
	private String input;

	public Component(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}
}
