package function;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		Bike b2=new Bike();
		
		b1.brand="audi";
		b2.brand="honda";
		
		Bike []bikes= {b1,b2};
		b1.findVowel(bikes);

	}

}
