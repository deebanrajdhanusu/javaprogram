package opps1;

public class Tshirt {
	private String brand;
	private int price;
	
	public Tshirt(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return brand+" "+price;
	}
	

}
