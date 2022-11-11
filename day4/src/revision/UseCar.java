package revision;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="skoda";
		car1.color="white";
		car1.price=3000000;
		car1.taxAmount=500000;
		char brandName=car1.brand.charAt(0);
		System.out.println(brandName);
		System.out.println(car1.brand.charAt(0));
		System.out.println(car1.color.charAt(4));
		car1.netAmount=car1.price+car1.taxAmount;
		System.out.println(car1.netAmount);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
