package opps2;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.brand="dell";
		l.price=35000;
		Computer c=new Computer();
		c.brand="lenovo";
		c.price=20000;
		System.out.println(l.price(c.price));
		System.out.println(l.add(47, 40));
		System.out.println(l.add(46,30, 40));
		// TODO Auto-generated method stub

	}

}
