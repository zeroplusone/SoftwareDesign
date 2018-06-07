package extensionObject;

import java.util.HashMap;

public abstract class Animal {
	private HashMap<String, Extension> extensionDictionary;
	
	public Animal(){
		extensionDictionary = new HashMap<String, Extension>();
	}
	public Extension getExtension(String name){
		if(extensionDictionary.containsKey(name)){
			return extensionDictionary.get(name);
		} else{
			return null;
		}
	}
	public void addExtension(String name, Extension extension){
		extensionDictionary.put(name, extension);
	}
	public void removeExtension(String name){
		if(extensionDictionary.containsKey(name)){
			extensionDictionary.remove(name);
		}
	}
	public abstract void move();
}
