package collection3;

public class Mobile {
	private String brand;
	private int price;
	private String color;
	private boolean isAndroid;
	private int ram;
	
	public Mobile(String a,int b,String c,boolean d,int e) {
		brand=a;
		price=b;
		color=c;
		isAndroid=d;
		ram=e;
	}
	public String toString() {
		return (brand+" "+price+" "+color+" "+isAndroid+" "+ram);
	
	}
	public void setIsAndroid(boolean a) {
		isAndroid=a;
	}
	public boolean getIsAndroid() {
		return isAndroid;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	

}
