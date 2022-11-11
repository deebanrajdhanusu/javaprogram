package opps1;

public class UseMobile {

	public static void main(String[] args) {
		Battery b=new Battery();
		Mobile m=new Mobile();
		
		b.brand="samsung";
		b.price=2000;
		
		m.brand="oppo";
		m.price=20000;
		m.color="red";
		m.battery=b;
		
		System.out.println(m.price+" "+m.brand+" "+m.battery.brand);
		// TODO Auto-generated method stub

	}

}
