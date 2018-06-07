package practice4;

public class WeatherData {
	Display display[];
	int data;
	public void notifyDisplay(){
		for(Display d:display){
			d.update(data);
		}
	}
}
