package looping;

public class PrintDivisibleBy3 {

	public static void main(String[] args) {
		int evenCount=0, oddCount=0;
		for (int i=1;i<=50;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
			if (i%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println(evenCount+" "+oddCount);
		// TODO Auto-generated method stub

	}

}
