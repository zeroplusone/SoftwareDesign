package practice11_command;

public class Editor {
	Document doc;
	EditMenu menu;
	public Editor(){
		doc=new Document(this);
		menu=new EditMenu(this);
	}
}
