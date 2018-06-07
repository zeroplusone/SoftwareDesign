package practice8_iterator;

public class DinnerIterator implements Iterator{
	DinnerList dinner;
	int now;
	public DinnerIterator(DinnerList dinner){
		this.dinner = dinner;
		now = 0;
	}
	public boolean hasNext(){
		if(now==dinner.length){
			return false;
		}
		else{
			return true;
		}
	}
	
	public Object Next(){
		return dinner.get(now++);
	}
}
