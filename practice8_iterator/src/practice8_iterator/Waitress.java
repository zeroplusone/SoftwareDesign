package practice8_iterator;

public class Waitress {
	public static void main(String[] args){
		printList(new BreakfastList());
		System.out.println("=====");
		printList(new DinnerList());
	}
	public static void printList(AbstractList list){
		Iterator it = list.getIterator();
		while(it.hasNext()){
			System.out.println(it.Next().toString());
		}
	}
}
