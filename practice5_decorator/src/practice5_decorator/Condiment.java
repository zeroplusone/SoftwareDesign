package practice5_decorator;

public abstract class Condiment extends Beverage{
	Beverage beverage;
	
	public Condiment(Beverage b){
		beverage = b;
	}
	public abstract double cost();
}
