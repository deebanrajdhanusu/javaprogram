package for3Raji;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile1= new Mobile();
		mobile1.brand = "Redmi";
		mobile1.color="White";
		mobile1.price= 15000;
		mobile1.is5G= true;
		Mobile mobile2= new Mobile();
		mobile2.brand = "Oppo";
		mobile2.color="Red";
		mobile2.price= 18000;
		mobile2.is5G= false;
		Mobile mobile3= new Mobile();
		mobile3.brand = "apple";
		mobile3.color="Grey";
		mobile3.price= 40000;
		mobile3.is5G= true;
		Mobile mobile4= new Mobile();
		mobile4.brand = "Vivo";
		mobile4.color="Yellow";
		mobile4.price= 25000;
		mobile4.is5G= true;
		Mobile mobile5= new Mobile();
		mobile5.brand = "Poco";
		mobile5.color="Blue";
		mobile5.price= 20000;
		mobile5.is5G= true;
		Mobile name[]= new Mobile[5];
		name[0]=mobile1;
		name[1]= mobile2;
		name[2]=mobile3;
		name[3]=mobile4;
		name[4]=mobile5;
		int max = 0;
		for(int i=0;i<name.length;i++) {
			if(name[i].price>=max) {
				max=name[i].price;
			}
			
		}
		System.out.println("Maximum = "+max);
		int mini = name[0].price;
		for(Mobile x :name) {
			if(x.price<=mini) {
				mini= x.price;
			}
		}
		System.out.println("Minimum = "+mini);
			
			
		}
			
		
	}

