package practice13_class_adapter;

public class TextShape extends TextView implements Shape {

	public TextShape(){
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

	@Override
	public void boundingBox() {
		// TODO Auto-generated method stub
		getExtend();
	}

}
