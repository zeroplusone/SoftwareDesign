package practice10_facade;

public class Tea extends CaffeineBeverage{
	public Tea(){
		
	}
	protected void brew(){
		System.out.println("[Tea] brew...");
	}
	
	protected void addCondiment(){
		System.out.println("add [Tea] condiments");
	}
}
