package opps2;

public class Fan {
	int price;
	String brand;
	int speed;
	public String speed(int speed) {
		if(speed>1200) {
			return "high speed ";
		}
		return "low speed ";
	}

}
