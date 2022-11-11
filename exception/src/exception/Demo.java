package exception;

public class Demo {

	public static void main(String[] args) {
		long a=857589992;
		int h;
		try {
			System.out.println(a*0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.err.println("welcome");
		}
		String b="";
		System.out.println(b.length());
		
		String c="Onesoft";
		System.out.println(c);
		

	}

}
