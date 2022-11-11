package looping;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=-1;
		int b=1;
		int c=0;
		
		for (int i=0;i<=n;i++) {
			System.out.println(c);  //a 1 0 1 1 2 3
			a=b;                    //b 0 1 1 2 3 5
			b=c;                    //c 1 1 2 3 5 8
			c=a+b;
			//a=a+i;
		}
		// TODO Auto-generated method stub

	}

}
