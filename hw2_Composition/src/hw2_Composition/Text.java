package hw2_Composition;

public class Text extends Component {

	private int fontSize = 12;

	public int getFontSize() {
		return fontSize;
	}

	public Text(String input) {
		super(input);
	}
}
