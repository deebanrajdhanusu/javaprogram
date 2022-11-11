package for2;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		
		car1.brand="honda";
		car1.price=120000;
		car1.color="white";
		car1.isTubeless=true;
		
		car2.brand="hyundai";
		car2.price=150000;
		car2.color="black";
		car2.isTubeless=true;
		
		car3.brand="kia";
		car3.price=180000;
		car3.color="grey";
		car3.isTubeless=true;
		
		Car []a= {car1,car2,car3};
		for(Car b:a) {
			//System.out.println(b.brand);
		}
		
		/*int []aaa= {5,6,9,10};
		for(Integer b:aaa) {
			System.out.println(b);
		}*/
		
		for(int i=0;i<a.length;i++) {
			if(a[i].price>=180000) {
			//System.out.println(a[i].brand);
		}
		}
		for(Car x:a) {
			if(x.color.equals("grey")) {
			System.out.println(x.brand);
		}
		}
	
	
		// TODO Auto-generated method stub

	}

}


class Car {
	String brand;
	int price;
	String color;
	boolean isTubeless;
}