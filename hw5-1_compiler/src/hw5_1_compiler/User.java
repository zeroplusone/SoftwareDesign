package hw5_1_compiler;

public class User {
	public static void main(String[] args){
		java.util.Scanner userScanner = new java.util.Scanner(System.in);
		System.out.println("Please input the name of code file:");
		String file = userScanner.next();
		new Compiler().compile(file);

	}
}
