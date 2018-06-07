package practice13_class_adapter;

import practice13_class_adapter.Shape;
import practice13_class_adapter.TextShape;

public class DrawingEditor {
	static Shape shape;
	public static void main(String[] args){
		shape = new TextShape();
		shape.display();
		shape.boundingBox();
	}
}
