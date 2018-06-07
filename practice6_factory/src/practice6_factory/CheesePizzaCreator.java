package practice6_factory;

public class CheesePizzaCreator implements PizzaCreator{
	public Pizza createPizza(){
		return new CheesePizza();
	}
}
