package opps2;

public class UseAc {

	public static void main(String[] args) {
		Ac ac=new Ac();
		Fan fan=new Fan();
		ac.brand="whirlpool";
		ac.price=35000;
		ac.speed=1600;
		fan.speed=1200;
		fan.brand="usha";
		fan.price=2400;
		System.out.println(ac.speed(ac.speed));
		// TODO Auto-generated method stub

	}

}
