package for2;

public class PrintPrimeArray {

	public static void main(String[] args) {
		int []a= {5,7,17,50};
		boolean []p= {true,true,true,true};
		//Boolean []p=new Boolean[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=2;j<a[i];j++) {
				if(a[i]%j!=0) {
					p[i]=true;
				}
				else {
					p[i]=false;
				}
			}
			
		}
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		/*for(int i=0;i<a.length;i++) {
			
			if(p[i]==true) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}*/
		// TODO Auto-generated method stub

	}

}
