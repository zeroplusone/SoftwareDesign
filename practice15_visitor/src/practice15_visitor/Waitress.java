package practice15_visitor;

public class Waitress {
	public static void main(String[] argv){
		Menu menu = new DinnerMenu("dinner1");
		menu.setMenuItems(new MenuItem("food1"), new MenuItem("food2"), new MenuItem("food3"));
		Information info = new Calories();
		menu.printMenu(info);
		info = new Protein();
		menu.printMenu(info);
		info = new Carbs();
		menu.printMenu(info);
	}
}
