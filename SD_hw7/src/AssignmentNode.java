
public class AssignmentNode extends Node{
	String assignmentName;
	
	public AssignmentNode(String a){
		assignmentName = a;
	}
	
	public void use(Operation op){
		op.operate(this);
	}
}
