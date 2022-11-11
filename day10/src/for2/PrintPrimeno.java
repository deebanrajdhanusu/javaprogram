package for2;

public class PrintPrimeno {

	public static void main(String[] args) {
		int []a= {5,7,9};
		for(int i=0;i<a.length;i++) {
			String statement = a[i]+"it is prime";
			for(int j=2;j<a[i];j++) {
			if(a[i]%j==0) {
				statement = a[i]+"it is not prime";
				
			}
			/*else {
				System.out.println(statement);
			}*/
		}
		// TODO Auto-generated method stub
			System.out.println(statement);
	}
	}

	}
