package practice6_factory;

import java.util.Scanner;

public class Client {
	public static void main(String args[]) {
		System.out.println("Please input Pizza Number (1)Cheese (2)Greek (3)Pepper(4)Six");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		PizzaStore ps = new PizzaStore();
		switch (input) {
		case 1:
			ps.createPizza(new CheesePizzaCreator());
			break;
		case 2:
			ps.createPizza(new GreekPizzaCreator());
			break;
		case 3:
			ps.createPizza(new PepperOniPizzaCreator());
			break;
		case 4:
			ps.createPizza(new SixPizzaCreator());
		}

	}
}
