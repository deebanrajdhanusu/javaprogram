package function;

public class UsePen {

	public static void main(String[] args) {
		Pen p1=new Pen();
		Pen p2=new Pen();
		Pen p3=new Pen();
		
		p1.brand="pentonic";
		p1.price=40;
		p1.color="black";
		p1.taxAmount=10;
		
		p2.brand="cello";
		p2.price=25;
		p2.color="green";
		p2.taxAmount=5;
		
		p3.brand="reynolds";
		p3.price=15;
		p3.color="blue";
		p3.taxAmount=10;
		
		Pen []p= {p1,p2,p3};
		
		System.out.println(p1.printMin(p));
		p1.findStringMax(p1, p2, p3);
		p1.findOdd(p);
		p1.findEvenIndexString(p);
		
		
		
		// TODO Auto-generated method stub

	}

}
