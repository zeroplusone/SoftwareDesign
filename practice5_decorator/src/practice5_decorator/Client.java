package practice5_decorator;

public class Client {
	public static void main(String args[]){
		Beverage b= new DarkRoast();
//		System.out.println(b.cost());
		b=new Milk(b);
//		System.out.println(b.cost());
		b=new Mocha(b);
		System.out.println(b.cost());
		
	}
}
