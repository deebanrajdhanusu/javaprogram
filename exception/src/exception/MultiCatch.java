package exception;

public class MultiCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e ) {
			System.out.println(e);
			//e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a+b);
		try {
			System.out.println(a%b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
