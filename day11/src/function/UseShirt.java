package function;

public class UseShirt {

	public static void main(String[] args) {
		Shirt s1=new Shirt();
		Shirt s2=new Shirt();
		Shirt s3=new Shirt();
		Shirt s4=new Shirt();
		Shirt s5=new Shirt();
		Shirt s6=new Shirt();
		
		s1.brand="otto";
		s1.price=1200;
		s1.color="white";
		
		s2.brand="indian terrain";
		s2.price=1600;
		s2.color="blue";
		
		s3.brand="levis";
		s3.price=2000;
		s3.color="white";
		
		s4.brand="peter england";
		s4.price=800;
		s4.color="white";
		
		s5.brand="max";
		s5.price=900;
		s5.color="white";
		
		s6.brand="louis philip";
		s6.price=1800;
		s6.color="white";
		
		Shirt []shirts= {s1,s2,s3,s4,s5,s6};
		
		s1.printShirt(shirts);

	}

}
