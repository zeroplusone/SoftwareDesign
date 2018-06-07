package practice9_composite;

public abstract class AbstractList {
	public abstract Iterator getIterator();
	
	public void printList(AbstractList list){
		Iterator it = list.getIterator();
		while(it.hasNext()){
			System.out.println(it.Next().toString());
		}
	}
}