package extensionObject;

public abstract class Role extends Extension{

	public Role(Animal owner) {
		super(owner);
	}
	public abstract void playRole();

}
