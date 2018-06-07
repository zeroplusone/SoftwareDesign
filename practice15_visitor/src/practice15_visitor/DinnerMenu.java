package practice15_visitor;

import java.util.ArrayList;

public class DinnerMenu extends Menu{
	ArrayList<Menu> menuItems = new ArrayList<Menu>();
	
	public DinnerMenu(String name){
		super.name = name;
	}
	public void printMenu(Information info){
		info.printInfo(this);
		
		for(int i = 0; i<menuItems.size();++i){
			menuItems.get(i).printMenu(info);
		}
	}
	
	public void setMenuItems(Menu...menus){
		menuItems.clear();
		for(int i = 0 ;i < menus.length;++i){
			menuItems.add(menus[i]);
		}
	}
	
}
