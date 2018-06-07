
public class CheckType implements Operation{

	@Override
	public void operate(VariableRefNode node) {
		// TODO Auto-generated method stub
		System.out.println("CheckType: "+node.type);
	}

	@Override
	public void operate(AssignmentNode node) {
		// TODO Auto-generated method stub
		System.out.println("CheckType: assignment no type");
		
	}

}
