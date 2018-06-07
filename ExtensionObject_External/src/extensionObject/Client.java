package extensionObject;

public class Client {

	public static void main(String[] args) {
		Animal sheep = new Sheep();
		sheep.addExtension("soldier", new SoldierRole(sheep));
		playRoleAs((Role) sheep.getExtension("soldier"));
		sheep.addExtension("peasant", new PeasantRole(sheep));
		playRoleAs((Role) sheep.getExtension("peasant"));
		sheep.removeExtension("peasant");
		playRoleAs((Role) sheep.getExtension("peasant"));
	}

	private static void playRoleAs(Role role) {
		if (role == null) {
			System.out.println("No supported extension");
			return;
		}
		role.playRole();
	}

}
