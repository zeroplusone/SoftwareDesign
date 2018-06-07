package practice7_abstract_factory;

public class NYIngredientFactory implements IngredientFactory{

	@Override
	public Sausage createSausage() {
		// TODO Auto-generated method stub
		return new NYSausage();
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new NYDough();
	}

}
