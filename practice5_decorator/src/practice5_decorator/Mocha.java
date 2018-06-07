package practice5_decorator;

public class Mocha extends Condiment{
	
	public Mocha(Beverage b){
		super(b);
	}
	public double cost() {
		return 2+beverage.cost();
	}
}
