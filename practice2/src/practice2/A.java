package practice2;

public class A {
	public void sayHello(String msg){
		System.out.println(msg);
	}
	public void sayHello(String msg, String msg2){
		System.out.println(msg+msg2);
	}
	public static void main(String[] args){
		A a = new A();
		a.sayHello("Hello!!");
		a.sayHello("Hello!!", "World!!");
	}
}
