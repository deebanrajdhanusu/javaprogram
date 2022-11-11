package opps2;

public class UseBike {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.price=50000;
		Cycle c=new Cycle();
		c.price=5000;
		System.out.println(b.discount(2000));
		// TODO Auto-generated method stub

	}

}
