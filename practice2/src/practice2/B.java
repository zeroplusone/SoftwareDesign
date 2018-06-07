package practice2;

public class B {
	public static void main(String[] args){
		Parent p1 = new Parent();
		say(p1);
		Child c1 = new Child();
		say(c1);
		Child2 c2 = new Child2();
		say(c2);
		Child3 c3 = new Child3();
		say(c3);
	}
	
	public static void say(Parent p){
		p.sayHello();
	}
}
