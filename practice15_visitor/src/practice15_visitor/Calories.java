package practice15_visitor;

public class Calories implements Information{

	@Override
	public void printInfo(Menu m) {
		// TODO Auto-generated method stub
		System.out.println("Calories of "+m.getName());
		
	}

}
