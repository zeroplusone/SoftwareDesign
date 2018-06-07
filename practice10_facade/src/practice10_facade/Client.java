package practice10_facade;

import java.util.Scanner;

public class Client {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int beverageType;
		CaffeineBeverage beverage=null;
		while(true){
			System.out.println("Please choose beverages? [1]Coffee [2]Tea");
			beverageType = scanner.nextInt();
			if(beverageType == 1){
				beverage = new Coffee();
			} else if(beverageType == 2){
				beverage = new Tea();
			} else{
				System.out.println("Wrong input\n");
				continue;
			}
			
			beverage.prepareRecipe();
			System.out.println("");
		}
	}
}
