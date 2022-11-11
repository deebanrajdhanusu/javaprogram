package for2;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		
		b1.brand="ktm";
		b1.price=120000;
		b1.color="red";
		b1.number="py-01 2567";
		
		b2.brand="hero";
		b2.price=80000;
		b2.color="blue";
		b2.number="tn-05 5617";
		
		b3.brand="royal enfield";
		b3.price=160000;
		b3.color="grey";
		b3.number="py-01 2333";
		
		Bike []a=new Bike[3];
		a[0]=b1;
		a[1]=b2;
		a[2]=b3;
		
		for(int i=0;i<a.length;i++) {
			if(a[i].number.contains("tn")) {
				//System.out.println(a[i].brand);
				
			}
		}
		int d=a[0].price;
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].price>d) {
				d=a[i].price;
				index=i;
			}
		}
		System.out.println(a[index].brand+" "+a[index].color+" "+a[index].number+" "+a[index].price);
		
		

	}

}
