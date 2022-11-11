package collection3;

public class Laptop {
	private String brand;
	private int price;
	private String color;
	private boolean isTouchScreen;
	public Laptop(String a,int b,String c,boolean d) {
		brand=a;
		price=b;
		color=c;
		isTouchScreen=d;
	}
	public String toString() {
		return (brand+" "+color+" "+price+" "+isTouchScreen);
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	

}
