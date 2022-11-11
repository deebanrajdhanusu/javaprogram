package function;

public class FindMaximum {
	public int findMax() {
		int []a= {15,65,105,87};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return(max);
	}

	public static void main(String[] args) {
		FindMaximum a=new FindMaximum();
		System.out.println(a.findMax());

	}

}
