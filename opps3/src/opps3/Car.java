package opps3;

public class Car implements Tesla {
	public String brand(String name) {
		if(name.equals("suzuki")) {
			return "suzuki";
		}
		else {
			return "not suzuki";
		}
	}
	public String speed(int a) {
		if(a<60) {
			return "low speed";
		}
		else {
			return "high speed";
		}
	}
	public int netPrice(int price,int discount) {
		return price-discount;
	}

}
