package opps1;

public class UseCar {

	public static void main(String[] args) {
		Engine engine=new Engine(200000,2000);
		Car car=new Car("honda",150000,engine);
		
		System.out.println(car);

	}

}
