package practice6_factory;

public class SixPizzaCreator implements PizzaCreator{
	public Pizza createPizza(){
		return new SixPizza();
	}
}
