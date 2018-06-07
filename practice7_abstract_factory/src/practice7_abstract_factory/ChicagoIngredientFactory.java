package practice7_abstract_factory;

public class ChicagoIngredientFactory implements IngredientFactory{

	@Override
	public Sausage createSausage() {
		// TODO Auto-generated method stub
		return new ChicagoSausage();
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ChicagoDough();
	}
	
}
