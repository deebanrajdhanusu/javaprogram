package object;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.price=5800000;
		car1.color="white";
		car1.taxAmount=500000;
		car1.disAmount=100000;
		car1.netPrice=car1.price + car1.taxAmount - car1.disAmount;
		System.out.println(car1.netPrice);
		
		Car car2=new Car();
		car2.brand="skoda";
		car2.price=350000;
		car2.color="white";
		car2.taxAmount=200000;
		car2.disAmount=50000;
		car2.netPrice=car2.price + car2.taxAmount - car2.disAmount;
		System.out.println(car2.taxAmount + car2.disAmount + car2.netPrice);
		
		// TODO Auto-generated method stub

	}

}
