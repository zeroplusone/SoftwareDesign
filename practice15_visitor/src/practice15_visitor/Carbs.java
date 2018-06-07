package practice15_visitor;

public class Carbs implements Information{

	@Override
	public void printInfo(Menu m) {
		// TODO Auto-generated method stub
		System.out.println("Carbs of "+m.getName());
	}

}
