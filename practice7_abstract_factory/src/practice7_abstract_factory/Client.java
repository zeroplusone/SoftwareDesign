package practice7_abstract_factory;

public class Client {
	public static void main(String[] args){
		
		IngredientFactory factory = new ChicagoIngredientFactory();
		Pizza pizza = new PepperPizza(factory);
		pizza.createPizza();
	}

}
