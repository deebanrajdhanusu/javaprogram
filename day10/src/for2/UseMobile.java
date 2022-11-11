package for2;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		Mobile m4=new Mobile();
		
		m1.brand="vivo";
		m1.price=17000;
		m1.taxAmount=3000;
		
		m2.brand="oppo";
		m2.price=25000;
		m2.taxAmount=4000;
		
		m3.brand="google";
		m3.price=120000;
		m3.taxAmount=20000;
		
		m4.brand="apple";
		m4.price=100000;
		m4.taxAmount=25000;
		
		Mobile []mobiles= {m1,m2,m3,m4};
		
		for(int i=0;i<mobiles.length;i++) {
			mobiles[i].netPrice=mobiles[i].price+mobiles[i].taxAmount;
			System.out.println(mobiles[i].netPrice);
		}

	}

}
