package opps3;

public class Car1 {
	private String brand;
	private int price;
	private Battery battery;
	public Car1(String brand,int price,Battery battery) {
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}
	public Car1() {
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

}
