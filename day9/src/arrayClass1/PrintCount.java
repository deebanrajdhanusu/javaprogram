package arrayClass1;

public class PrintCount {

	public static void main(String[] args) {
		int count=0;
		String []a= {"ram","raj","velu","raja"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2!=0) {
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
