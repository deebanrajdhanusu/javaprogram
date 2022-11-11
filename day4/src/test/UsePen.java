package test;

public class UsePen {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.brand="reynolds";
		pen1.price=5;
		pen1.color="blue";
		Pen pen2=new Pen();
		pen2.brand="parker";
		pen2.price=25;
		pen2.color="black";
		System.out.println(pen1.brand.toUpperCase());
		System.out.println(pen2.brand.toUpperCase());
		System.out.println(pen1.brand.contains("r"));
		System.out.println(pen2.brand.contains("r"));
		System.out.println(pen1.brand.charAt(2));
		System.out.println(pen2.brand.charAt(4));
		System.out.println(pen1.brand.split("."));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
