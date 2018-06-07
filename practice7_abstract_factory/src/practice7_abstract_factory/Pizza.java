package practice7_abstract_factory;

public class Pizza {
	Dough dough;
	Sausage sausage;
	IngredientFactory factory;
	public Pizza(IngredientFactory factory){
		this.factory = factory;
	}
	
	public void createPizza(){
		dough = factory.createDough();
		sausage = factory.createSausage();
	}
}
