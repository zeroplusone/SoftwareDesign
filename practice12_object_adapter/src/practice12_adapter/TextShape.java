package practice12_adapter;

public class TextShape implements Shape{

	TextView textView;
	public TextShape(){
		textView = new TextView();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		textView.display();
	}

	@Override
	public void boundingBox() {
		// TODO Auto-generated method stub
		textView.getExtend();
	}

}
