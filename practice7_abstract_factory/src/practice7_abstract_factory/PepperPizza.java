package practice7_abstract_factory;

public class PepperPizza extends Pizza{

	public PepperPizza(IngredientFactory factory) {
		super(factory);
	}
	
	public void createPizza(){
		super.createPizza();
		System.out.println("Special Ingredients for Pepper Pizza");
	}

}
