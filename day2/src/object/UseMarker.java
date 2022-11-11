package object;

public class UseMarker {

	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.color="black";
		m1.price=25;
		m1.brand="color";
		m1.size=2.5f;
		m1.isRefillable=true;
		
		Marker m2=new Marker();
		m2.color="red";
		m2.price=50;
		m2.brand="cameline";
		m2.size=2.8f;
		m2.isRefillable=true;
		System.out.println(m1.color+" "+m1.brand+" "+m1.price+" "+m1.isRefillable);
		System.out.println(m2.color+" "+m2.brand+" "+m2.price+" "+m2.isRefillable);
		
		
		// TODO Auto-generated method stub

	}

}
