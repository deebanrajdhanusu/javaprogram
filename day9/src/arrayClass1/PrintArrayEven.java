package arrayClass1;

public class PrintArrayEven {

	public static void main(String[] args) {
		int []a= {40,50,35,16,9,3};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even"+a[i]);
			}
			else {
				System.out.println("odd"+a[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
