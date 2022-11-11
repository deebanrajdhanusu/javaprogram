package arrayClass1;

public class PrintMaxString {

	public static void main(String[] args) {
		String []a= {"honda","herohonda","ktm"};
		String b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>=b.length()) {
				b=a[i];
				}
		}
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
