package lmsbasics;

public class UseCar {

	public static void main(String[] args) {
		Car a =new Car();
		a.brand=args[0];
		a.price=Integer.parseInt(args[1]);
		a.color=args[2];
		Car b=new Car();
		b.brand=args[3];
		b.price=Integer.parseInt(args[4]);
		b.color=args[5];
		System.out.println("Brand= "+a.brand.toUpperCase()+" price= "+a.price+" color= "+a.color.toUpperCase());
		System.out.println("Brand= "+b.brand.toUpperCase()+" price= "+b.price+" color= "+b.color.toUpperCase());
		
		
		// TODO Auto-generated method stub

	}

}


 class Car {
	 String brand;
	 int price;
	 String color;
	
	
}
