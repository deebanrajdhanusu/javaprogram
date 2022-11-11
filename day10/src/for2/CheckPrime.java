package for2;

public class CheckPrime {

	public static void main(String[] args) {
		int []a= {2,17,20,27,17,40};
		//String b="is prime";
		for(int i=0;i<a.length;i++) {
			String b="is prime";
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					b="not prime";
				
				}
			}
			System.out.println(b);
		}
		// TODO Auto-generated method stub

	}

}
