package hw5_1_compiler;

public class BytecodeStream {
	public BytecodeStream(){
		
	}
	public void inputBytecode(ProgramNode root){
		root.getBytecode();
		System.out.println("[BytecodeStream] put bytecode into Stream");
	}
}
