package opps2;

public class Bike extends Cycle {
	int speed;
	public String speed() {
		if(speed>120) {
			return "high speed";
		}
		return "low speed";
	}

}
