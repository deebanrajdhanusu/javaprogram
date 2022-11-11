package opps2;

public class Ac extends Fan {
	int price;
	String brand;
	int speed;
	public String temperature(int temp) {
		if(temp<20) {
			return "temperature is low ";
		}
		return "temperature is high ";
	}

}
