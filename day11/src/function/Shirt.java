package function;

public class Shirt {
	String brand;
	int price;
	String color;
	
	public void printShirt(Shirt []a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].price>1000) {
				System.out.println("BRAND= "+a[i].brand.toUpperCase()+" PRICE= "+a[i].price+" COLOR= "+a[i].color.toUpperCase());
			}
		}
	}

}
