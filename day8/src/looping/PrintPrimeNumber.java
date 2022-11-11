package looping;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		int a=137;
		int p=0;
		int np=0;
		for (int i=1;i<=a;i++) {
			if (a%i==0) {
				p++;
			}
			else {
				np++;
			}
		}
			if (p==2) {
				System.out.println("prime number");
			}
			else if (np>0) {
				System.out.println("not a prime number");
			}
			else {
				System.out.println("invalid number");
			}
		
		// TODO Auto-generated method stub

	}

}
