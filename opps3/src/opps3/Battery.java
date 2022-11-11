package opps3;

public class Battery {
	private String brand;
	private int price;
	private float volt;
	public Battery(String brand,int price,float volt) {
		this.brand=brand;
		this.price=price;
		this.volt=volt;
	}
	public Battery() {
		
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
	public float getVolt() {
		return volt;
	}
	public void setVolt(float volt) {
		this.volt = volt;
	}

}
