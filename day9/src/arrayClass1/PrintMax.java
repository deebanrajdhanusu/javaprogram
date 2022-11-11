package arrayClass1;

public class PrintMax {
	public static void main(String []args) {
		int []num= {4,9,3,2,5};
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(max<=num[i]) {
				max=num[i];
			}
		}
		System.out.println(max);
	}

}
