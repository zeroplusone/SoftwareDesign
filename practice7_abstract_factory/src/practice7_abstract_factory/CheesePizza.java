package practice7_abstract_factory;

public class CheesePizza extends Pizza{

	public CheesePizza(IngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}
	
	public void createPizza(){
		super.createPizza();
		System.out.println("Special Ingredients for Cheese Pizza");
	}
	
}
