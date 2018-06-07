package practice14_builder;

public class VacationPlanner {
	public void contruct(VacationBuilder vb){
		vb.chooseDay();
		vb.chooseHotel();
		vb.chooseTicket();
	}
}
