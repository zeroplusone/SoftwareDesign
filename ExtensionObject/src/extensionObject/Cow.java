package extensionObject;

import java.util.HashMap;

public class Cow extends Animal{

	public Cow(){
		extensionDictionary = new HashMap<String, Extension>();
		extensionDictionary.put("peasant", new PeasantRole(this));
		System.out.println("creating Cow...");
	}
	@Override
	public void move() {
		System.out.println("Cow move");		
	}

}
