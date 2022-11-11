package opps1;

public class Engine {
	private int price ;
	private int cc;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Engine(int price,int cc) {
		this.price=price;
		this.cc=cc;
	}
	
	public String toString() {
		return price+" "+cc;
	}
	
	
}
