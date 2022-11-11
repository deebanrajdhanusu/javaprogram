package opps3;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=100;
		for(int i=2;i<num;i++) {
			int p=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					p++;
				}
			}
			if(p==0) {
				System.out.println(i);
			}
		}
		/*if(p==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}*/
		// TODO Auto-generated method stub

	}

}
