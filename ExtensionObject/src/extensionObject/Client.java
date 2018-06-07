package extensionObject;

public class Client {

	public static void main(String[] args) {
		Animal sheep = new Sheep();
		playRoleAs( (Role) sheep.getExtension("soldier"));
		playRoleAs( (Role) sheep.getExtension("peasant"));
		Animal cow = new Cow();
		playRoleAs( (Role) cow.getExtension("soldier"));
		playRoleAs( (Role) cow.getExtension("peasant"));
	}
	
	private static void playRoleAs(Role role){
		if (role == null) {
			System.out.println("No supported extension");
			return;
		}
		role.playRole();
	}

}
