package function;

public class Cube {
	public int findCube() {
		int a=5;
		return(a*a*a);
	}
	public static void main(String []args) {
		Cube a=new Cube();
		System.out.println(a.findCube());
	}

}
