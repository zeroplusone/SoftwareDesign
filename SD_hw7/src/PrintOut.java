
public class PrintOut implements Operation{

	@Override
	public void operate(VariableRefNode node) {
		// TODO Auto-generated method stub
		System.out.println("PrintOut:"+node.variableName);
	}

	@Override
	public void operate(AssignmentNode node) {
		// TODO Auto-generated method stub
		System.out.println("PrintOut:"+node.assignmentName);
		
	}

}
