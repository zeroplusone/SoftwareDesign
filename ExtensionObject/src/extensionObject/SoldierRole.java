package extensionObject;

public class SoldierRole extends Role {

	public SoldierRole(Animal owner) {
		super(owner);
		System.out.println("Soldier Role creating...");
	}


	public void playRole() {
		this.owner.move();
		System.out.println("Shooting");

	}

}
