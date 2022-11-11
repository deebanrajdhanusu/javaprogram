package for2;

public class PrintPrimeUsingSingleFor {

	public static void main(String[] args) {
		int []a= {2,20,7};
		int b=2;
		for(int i=0;i<a.length;i++ ) {
			if(a[i]%b!=0) {
				if(b<a[i]) {
					b++;
					if(a[i]%b!=0) {
						System.out.println("prime");;
					}
				}
			}
				System.out.println("not prime");
		}
	
	}
}