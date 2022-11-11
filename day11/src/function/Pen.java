package function;

public class Pen {
	String brand;
	int price;
	String color;
	int taxAmount;
	public String printMin(Pen []a) {
		int min=a[0].price;
		Pen temp=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i].price) {
				min=a[i].price;
				temp=a[i];
			}
		}
		return ("BRAND= "+temp.brand+" PRICE= "+temp.price+" color= "+temp.color);
		
	}
	public void findStringMax (Pen a,Pen b,Pen c) {
			if(a.brand.length()>b.brand.length()&&a.brand.length()>c.brand.length()) {
				System.out.println("brand= "+a.brand+" price= "+a.price);
			}
			else if(b.brand.length()>a.brand.length()&&b.brand.length()>c.brand.length()) {
				System.out.println("brand= "+b.brand+" price= "+b.price);
			}
			else {
				System.out.println("brand= "+c.brand+" price= "+b.price);
			}
 
	}
	public void findOdd(Pen []a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].brand.length()%2==0) {
				System.out.println("even brand");
			}
			else {
				System.out.println("odd brand");
			}
		}
	}
	public void findEvenIndexString(Pen a[]) {
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i].brand+" even index String");
			}
		}
	}
	

}
