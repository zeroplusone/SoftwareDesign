package practice12_adapter;

public class DrawingEditor {
	static Shape shape;
	
	public static void main(String[] args){
		shape = new TextShape();
		shape.display();
		shape.boundingBox();
	}
}
