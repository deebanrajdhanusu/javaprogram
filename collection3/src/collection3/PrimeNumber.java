package collection3;

public class PrimeNumber {
	public static void main(String[]args) {
		
		int []a= {100,120,45,67,89};
		for(int i=0;i<a.length;i++) {
			int b=0;
			for(int j=2;j<i;j++) {
				if(a[i]%j==0) {
					b++;
				}
			}
			if(b==0) {
				System.out.println(a[i]+" is Prime");
			}
			else {
				System.out.println(a[i]+" is Not Prime");
			}
		}
	}

}
