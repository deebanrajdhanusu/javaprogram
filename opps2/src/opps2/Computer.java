package opps2;

public class Computer {
	String brand;
	int price;
	public String speed(float speed) {
		if(speed>3.3) {
			return "high speed processor";
		}
		else {
			return "low speed proessor";
		}
	}
	public String price(int price) {
		if(price>10000) {
			return "costly";
		}
		else {
			return "affordable";
		}
	}
	public boolean equals(String a) {
		return a.equals(brand);
	}

}
