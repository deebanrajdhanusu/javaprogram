package lmsbasics;

public class UseSaree {
	public static void main(String[]args) {
		String details1=args[0];
		String []details2=details1.split(",");
		Saree a=new Saree();
		a.material=details2[0];
		a.color=details2[1];
		a.price=Integer.parseInt(details2[2]);
		a.discountPercentage=Integer.parseInt(details2[3]);
		a.netPrice=a.price-(a.price*a.discountPercentage/100);
		System.out.println("Material: "+a.material.toUpperCase()+" color: "+a.color.toUpperCase()+" NetPrice: "+a.netPrice);
		
		
		String details3=args[1];
		String []details4=details3.split(",");
		Saree b=new Saree();
		b.material=details4[0];
		b.color=details4[1];
		b.price=Integer.parseInt(details4[2]);
		b.discountPercentage=Integer.parseInt(details4[3]);
		b.netPrice=b.price-(b.price*b.discountPercentage/100);
		System.out.println("Material: "+b.material.toUpperCase()+" color: "+b.color.toUpperCase()+" NetPrice: "+b.netPrice);
		
		

		
		
	}

}


class Saree {
	String material;
	String color;
	int price;
	int discountPercentage;
	int netPrice;
}
