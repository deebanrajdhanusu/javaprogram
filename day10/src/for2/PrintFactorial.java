package for2;

public class PrintFactorial {
	public static void main(String []args) {
		int num=5;
		int a=1;
		for(int i=1;i<=num;i++) {
			a=a*i;
		}
		//System.out.println(a);
		int b[]= {2,5,9,-19,-5};
		int n=0,p=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>=0) {
				//System.out.println(b[i]);
				p++;
			}
			else {
				//System.out.println(b[i]);
				n++;
			}
		}
		//System.out.println(n+" "+p);
		String c[]= {"raj","ashok","suresh","sridhar","ranesh"};
		for(int i=0;i<c.length;i++) {
			if(i>=0) {
				System.out.println(c[i]);
				i++;
			}
		}
	}

}
