package practice10_facade;

public class Coffee extends CaffeineBeverage{
	public Coffee(){
		
	}
	protected void brew(){
		System.out.println("[Coffee] brew...");
	}
	
	protected void addCondiment(){
		System.out.println("add [Coffee] condiments");
	}
}
