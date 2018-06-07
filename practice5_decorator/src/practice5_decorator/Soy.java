package practice5_decorator;

public class Soy extends Condiment{
	
	public Soy(Beverage b){
		super(b);
	}
	
	public double cost() {
		return 3+beverage.cost();
	}
}
