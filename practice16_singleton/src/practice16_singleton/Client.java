package practice16_singleton;

public class Client {
	public static void main(String[] argv){
		System.out.println(Single.num);
		Single.getInstance().run();
		System.out.println(Single.num);
		Single.getInstance().run();
		System.out.println(Single.num);
	}
}
