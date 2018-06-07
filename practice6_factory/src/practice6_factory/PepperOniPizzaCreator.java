package practice6_factory;

public class PepperOniPizzaCreator implements PizzaCreator{
	public Pizza createPizza(){
		return new PepperOniPizza();
	}
}
