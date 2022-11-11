package opps1;

public class Ac {
	String brand;
	float tons;
	int price;
	boolean isWarranty;
	
	public Ac(String brand,float tons,boolean isWarranty,int price) {
		this.brand=brand;
		this.tons=tons;
		this.isWarranty=isWarranty;
		this.price=price;
	}
	public String toString() {
		return brand+" "+tons+" "+isWarranty;
	}

}
