package opps2;

public class Laptop extends Computer {
	String brand;
	int price;
	public String price(int price) {
		if(price<25000) {
			return "affordable";
		}
		return "costlier";
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

}
