
public class Product {

	private String type;
	private String title;
	private double price;
	
	public Product(String type, String title, double price){
		this.type = type;
		this.title = title;
		this.price = price;
	}
	
	public String getType(){
		return type;
	}
	
	public String getTitle(){
		return title;
	}
	
	public double getPrice(){
		return price;
	}
}
