
public class VariableRefNode extends Node{
	String variableName;
	String type;
	
	public VariableRefNode(String v, String t){
		variableName = v;
		type = t;
	}
	
	public void use(Operation op){
		op.operate(this);
	}
}
