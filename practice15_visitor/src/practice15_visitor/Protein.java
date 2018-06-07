package practice15_visitor;

public class Protein implements Information{

	@Override
	public void printInfo(Menu m) {
		System.out.println("Protein of "+m.getName());
	}

}
