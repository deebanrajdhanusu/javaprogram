package lmsbasics;

public class UseMobile {
	public static void main(String []args) {
		String a[]=args[0].split(",");
		Mobile mobile=new Mobile();
		mobile.brand=a[0];
		mobile.price=Integer.parseInt(a[1]);
		mobile.color=a[2];
		System.out.println("Brand= "+mobile.brand+","+"Price= "+mobile.price+","+"Colour= "+mobile.color);
		
		
		String b[]=args[1].split(",");
		Mobile mobile1=new Mobile();
		mobile1.brand=b[0];
		mobile1.price=Integer.parseInt(b[1]);
		mobile1.color=b[2];
		System.out.println("Brand= "+mobile1.brand+","+"Price= "+mobile1.price+","+"Colour= "+mobile1.color);
		
	}

}


class Mobile {
	String brand;
	int price;
	String color;
	
}
