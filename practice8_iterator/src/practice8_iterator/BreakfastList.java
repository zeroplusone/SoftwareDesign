package practice8_iterator;

import java.util.ArrayList;

public class BreakfastList implements AbstractList{
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
}
