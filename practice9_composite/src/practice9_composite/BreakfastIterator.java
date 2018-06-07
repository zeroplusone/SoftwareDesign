package practice9_composite;

public class BreakfastIterator implements Iterator{
	BreakfastList breakfast;
	int now;
	public BreakfastIterator(BreakfastList breakfast){
		this.breakfast=breakfast;
		now = 0;
	}
	
	public boolean hasNext(){
		if(now==breakfast.getSize()){
			return false;
		}
		else{
			return true;
		}
	}
	
	public Object Next(){
		return breakfast.getNode(now++);
	}
}
