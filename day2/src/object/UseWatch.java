package object;

public class UseWatch {

	public static void main(String[] args) {
		Watch watch1=new Watch();
		watch1.brand="rolex";
		watch1.price=200000;
		watch1.color="silver";
		watch1.taxPercentage=8;
		watch1.disPercentage=12;
		double tax=watch1.price*(0.08);
		double discount=watch1.price*0.12;
		watch1.netPrice=watch1.price+tax-discount;
		System.out.println(watch1.netPrice);
		System.out.println(tax - discount + watch1.price);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
