package practice6_factory;

public class PizzaStore {
	public void createPizza(PizzaCreator pizzaC){
		pizzaC.createPizza().prepare();
	}
}
