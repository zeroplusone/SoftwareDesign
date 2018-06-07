package hw5_1_compiler;

public class Parser {
	public Parser(){
		
	}
	
	public ProgramNode parse(Scanner scanner){
		scanner.getTokens();
		System.out.println("[Parser] Create parse tree(ProgramNode)");
		ProgramNode root = new ProgramNode();
		return root;
	}

}
