package extensionObject;

import java.util.HashMap;

public class Sheep extends Animal {


	public Sheep() {
		extensionDictionary = new HashMap<String, Extension>();
		extensionDictionary.put("soldier", new SoldierRole(this));
		extensionDictionary.put("peasant", new PeasantRole(this));
		System.out.println("creating Sheep...");
	}

	public void move() {
		System.out.println("Sheep move");

	}

}
