package lmsbasics;

public class UseComputer {
	public static void main(String[]args) {
		
		String []details=args[0].split(",");
		Computer a=new Computer();
		a.brand=details[0];
		a.displaySize=Float.parseFloat(details[1]);
		a.price=Integer.parseInt(details[2]);
		a.taxPercentage=Integer.parseInt(details[3]);
		a.netPrice=a.price+(a.price*a.taxPercentage/100);
		System.out.println("Brand= "+a.brand+" displaySize= "+a.displaySize+" NetPrice= "+a.netPrice);
		
		
		
		
	}

}


class Computer {
	String brand;
	float displaySize;
	int price;
	int taxPercentage;
	int netPrice;
}