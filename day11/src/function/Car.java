package function;

public class Car {
	String color;
	int price;
	public void findPrice(Car a,Car b) {
		if(a.price>b.price) {
			System.out.println(a.price+" price is higher");
		}
		else {
			System.out.println(b.price+" price is higher");
		}
	}

}
