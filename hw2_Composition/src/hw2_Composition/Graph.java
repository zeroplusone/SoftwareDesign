package hw2_Composition;

public class Graph extends Component {

	private int height = 360;
	private int width = 480;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public Graph(String input) {
		super(input);
	}

}
