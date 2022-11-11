package function;

public class Pencil {
	String brand;
	int price;
	int taxAmount;
	public String netPrice(int a,int b) {
		return("netPrice="+(a+b));
	}
	public static void main(String []args) {
		Pencil a=new Pencil();
		a.brand="apsara";
		a.price=15;
		a.taxAmount=5;
		System.out.println(a.netPrice(a.price, a.taxAmount));
				
	}

}
