package practice14_builder;

public class Client {
	public static void main(String[] args){
		new VacationPlanner().contruct(new BackpackVacation());
		new VacationPlanner().contruct(new NormalVacation());
	}
}
