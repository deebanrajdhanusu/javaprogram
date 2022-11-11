package opps1;

public class Car {
	private String brand;
	private int price;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public Car(String brand,int price,Engine engine) {
		this.brand=brand;
		this.price=price;
		this.engine=engine;
	}
	
	public String toString() {
		return brand+" "+price+" "+engine.getCc()+" "+engine.toString();
	}

}
