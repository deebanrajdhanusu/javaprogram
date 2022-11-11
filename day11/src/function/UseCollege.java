package function;

public class UseCollege {

	public static void main(String[] args) {
		College c1=new College();
		College c2=new College();
		College c3=new College();
		College c4=new College();
		College c5=new College();
		
		c1.name="pondicherry engineering college";
		c1.fees=40000;
		
		c2.name="christ";
		c2.fees=60000;
		
		c3.name="manakula vinayagar";
		c3.fees=150000;
		
		c4.name="raak";
		c4.fees=80000;
		
		College []colleges= {c1,c2,c3,c4};
		
		System.out.println(c1.findFees(colleges));
		
		// TODO Auto-generated method stub

	}

}
