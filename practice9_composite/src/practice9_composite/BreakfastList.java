package practice9_composite;

import java.util.ArrayList;

public class BreakfastList extends AbstractList{
	ArrayList<String> breakfast;
	public BreakfastList(){
		breakfast=new ArrayList<String>();
		breakfast.add("E");
		breakfast.add("F");
		breakfast.add("G");
	}
	public Iterator getIterator(){
		return new BreakfastIterator(this);
	}
	public String getNode(int index){
		return breakfast.get(index);
	}
	public int getSize(){
		return breakfast.size();
	}
	public void printList(AbstractList list){
		super.printList(list);
	}
}
