package arrayClass1;

public class PrintName {

	public static void main(String[] args) {
		String []a= {"raj","ram","suresh","ramesh"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2==0) {
				System.out.println(a[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
