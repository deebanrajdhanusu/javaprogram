package looping;

public class PrintFactorial {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int factorial=1;
		for (int i=1;i<=num;i++) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		// TODO Auto-generated method stub

	}

}
