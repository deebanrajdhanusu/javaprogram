package exception;

public class Eception {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException  e) {
			System.err.print("never divide a number by zero");
			e.printStackTrace();
		}
		int c=20;
		int d=5;
		System.out.println(c*d);
		

	}

}
