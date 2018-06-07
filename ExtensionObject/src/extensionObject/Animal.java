package extensionObject;

import java.util.HashMap;

public abstract class Animal {
	protected HashMap<String, Extension> extensionDictionary;
	public Extension getExtension(String name){
		if(extensionDictionary.containsKey(name)){
			return extensionDictionary.get(name);
		}else{
			return null;
		}
	}
	public abstract void move();
}
