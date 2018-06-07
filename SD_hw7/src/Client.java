
public class Client {
	public static void main(String[] argv){
		Node var = new VariableRefNode("haha", "String");
		Node ass = new AssignmentNode("=");
		Operation op = new CheckType();
		var.use(op);
		ass.use(op);
		
		op = new GenerateCode();
		var.use(op);
		ass.use(op);
		
		op = new PrintOut();
		var.use(op);
		ass.use(op);
	}
}
