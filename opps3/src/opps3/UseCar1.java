package opps3;

public class UseCar1 {

	public static void main(String[] args) {
		Battery b=new Battery("amaron",12000,12.6f);
		Battery b1=new Battery();
		Car1 c=new Car1("honda",120000,b);
		b1.setBrand("exide");
		System.out.println(b1.getBrand());
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
