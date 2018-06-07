package practice9_composite;

public class DinnerList extends AbstractList{
	String[] dinner;
	public int length=0;
	public DinnerList(){
		dinner=new String[]{"A","B","C"};
		length=dinner.length;
	}
	public Iterator getIterator(){
		return new DinnerIterator(this);
	}
	public String get(int index){
		return dinner[index];
	}
}
