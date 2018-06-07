package practice5_decorator;

public class Whip extends Condiment{
	
	public Whip(Beverage b){
		super(b);
	}
	
	public double cost() {
		return 4+beverage.cost();
	}
}
