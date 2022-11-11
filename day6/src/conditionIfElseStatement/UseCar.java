package conditionIfElseStatement;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="honda";
		car1.color="white";
		car1.price=2000000;
		
		Car car2=new Car();
		car2.brand="kun hyundai";
		car2.color="blue";
		car2.price=1500000;
		
		Car car3=new Car();
		car3.brand="kia";
		car3.color="ash";
		car3.price=1600000;
		
		if(car1.price>=car2.price) {
			System.out.println(car1.brand.charAt(0));
		}
		else {
			System.out.println(car2.brand.charAt(0));
		}
		
		// TODO Auto-generated method stub

	}

}
