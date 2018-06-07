package hw2_Composition;

import java.util.Scanner;

public class Layout {

	static String SIMPLE = "1";
	static String TEX = "2";
	static String ARRAY = "3";
	static String GRAGH = "0";
	static String TEXT = "1";

	public static void main(String args[]) {

		Composition composition = new Composition();
		String inputStr;
		String inputType;
		String inputAlgorithm;
		boolean hasNextInput = true;

		Scanner scanner = new Scanner(System.in);

		while (hasNextInput) {
			System.out.print("Gragh(input 0) or Text(input 1):");
			inputType = scanner.nextLine();
			System.out.print("Please input your composition:");
			inputStr = scanner.nextLine();

			Component c = null;
			if (GRAGH.equals(inputType)) {
				c = new Graph(inputStr);
			} else if (TEXT.equals(inputType)) {
				c = new Text(inputStr);
			} else {
				System.out.println("Error Input. Try again");
				continue;
			}
			composition.input(c);

			System.out.print("Do you want to input more components?[y/n]");
			hasNextInput = "y".equals(scanner.nextLine()) ? true : false;
		}

		System.out.print("simple(input 1) or Tex(input 2) or Array(input 3):");
		inputAlgorithm = scanner.nextLine();

		Algorithm a = null;
		if (SIMPLE.equals(inputAlgorithm)) {
			a = new SimpleComposition();
		} else if (TEX.equals(inputAlgorithm)) {
			a = new TexComposition();
		} else if (ARRAY.equals(inputAlgorithm)) {
			a = new ArrayComposition();
		}

		System.out.println("----Below is your composition and line breaking algorithm.----");
		composition.printComponent();
		composition.algorithm(a);

	}

}
