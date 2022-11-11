package function;

public class PrintMin {
	public int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int []a= {27,85,42,109,56};
		
		PrintMin b=new PrintMin();
		
		System.out.println(b.min(a));

	}

}
