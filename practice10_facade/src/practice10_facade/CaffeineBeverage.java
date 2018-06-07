package practice10_facade;

public abstract class CaffeineBeverage {
	public void prepareRecipe(){
		boilWater();
		brew();
		pureInCup();
		addCondiment();
	}
	
	private void boilWater(){
		System.out.println("boil water...");
	}
	private void pureInCup(){
		System.out.println("Pure in cup...");
	}
	
	protected abstract void brew();
	protected abstract void addCondiment();
}
