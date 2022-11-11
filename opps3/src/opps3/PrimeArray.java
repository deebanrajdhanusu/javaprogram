package opps3;

public class PrimeArray {

	public static void main(String[] args) {
		int []a= {3,7,25,20,50,27};
		for(int i=0;i<a.length;i++) {
			int p=0;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					p++;
				}
			}
			if(p==0) {
				System.out.println(a[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
