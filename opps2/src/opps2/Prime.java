package opps2;

public class Prime {

	public static void main(String[] args) {
		int a=100;
		for(int i=2;i<a;i++) {
			for(int j=2;j<i;j++) {
				if(i%j!=0) {
					System.out.println(i);
				}
			}
		}

	}

}
