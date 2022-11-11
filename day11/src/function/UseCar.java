package function;

public class UseCar {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.price=1000000;
		c1.color="red";
		c2.price=1500000;
		c2.color="blue";
		c1.findPrice(c1,c2);
		// TODO Auto-generated method stub

	}

}
