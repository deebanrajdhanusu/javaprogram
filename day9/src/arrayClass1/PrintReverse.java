package arrayClass1;

public class PrintReverse {

	public static void main(String[] args) {
		int a[]= {26,48,50,70,30};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
