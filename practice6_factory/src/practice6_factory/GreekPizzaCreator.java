package practice6_factory;

public class GreekPizzaCreator implements PizzaCreator{
	public Pizza createPizza(){
		return new GreekPizza();
	}
}
