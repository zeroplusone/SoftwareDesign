package hw5_1_compiler;

public class Compiler {
	Scanner scanner;
	Parser parser;
	ProgramNode programNode;
	BytecodeStream bytecodeStream;
	
	public Compiler(){
		scanner = new Scanner();
		parser = new Parser();
		programNode = new ProgramNode();
		bytecodeStream = new BytecodeStream();
	}
	
	public void compile(String file){
		System.out.println("====[Compiler] call scanner====");
		
		scanner.readfile(file);
		System.out.println("");
		System.out.println("====[Compiler] call parser====");
		ProgramNode root = parser.parse(scanner);
		System.out.println("");
		System.out.println("====[Compiler] call programNode====");
		root.traverse();
		System.out.println("");
		System.out.println("====[Compiler] call bytecodeStream====");
		bytecodeStream.inputBytecode(root);
		
	}

}
