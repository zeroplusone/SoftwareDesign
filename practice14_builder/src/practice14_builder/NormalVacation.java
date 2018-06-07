package practice14_builder;

public class NormalVacation implements VacationBuilder{

	@Override
	public void chooseDay() {
		// TODO Auto-generated method stub
		System.out.println("normal chooseDay");
	}

	@Override
	public void chooseHotel() {
		// TODO Auto-generated method stub
		System.out.println("normal chooseHotel");
	}

	@Override
	public void chooseTicket() {
		// TODO Auto-generated method stub
		System.out.println("normal chooseTicket");
	}

}
