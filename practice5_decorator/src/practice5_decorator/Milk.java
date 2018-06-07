package practice5_decorator;

public class Milk extends Condiment{

	public Milk(Beverage b){
		super(b);
	}
	public double cost() {
		return 1+beverage.cost();
	}
	
}
