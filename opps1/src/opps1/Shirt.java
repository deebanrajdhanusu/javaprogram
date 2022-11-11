package opps1;

public class Shirt {
	private String brand;
	private int price;
	private String sleeve;
	private Tshirt tshirt;
	public Shirt(String brand,int price,String sleeve,Tshirt tshirt) {
		this.brand=brand;
		this.price=price;
		this.sleeve=sleeve;
		this.tshirt=tshirt;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setSleeve(String sleeve) {
		this.sleeve=sleeve;
	}
	public void setTshirt(Tshirt tshirt) {
		this.tshirt=tshirt;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getSleeve() {
		return sleeve;
	}
	public Tshirt getTshirt() {
		return tshirt;
	}
	public String toString() {
		return brand+" "+price+" "+sleeve+" "+tshirt;
	}

}
