package looping;

public class FindUpperCaseAndLowerCount {

	public static void main(String[] args) {
		String word ="OraNGe";
		String value=word.toUpperCase();
		int uCount=0, lCount=0;
		for (int i=0; i<=word.length()-1;i++) {
			if (word.charAt(i)==value.charAt(i)) {
				uCount++;
			}
			else {
				lCount++;
			}
		}
		System.out.println(uCount+" "+lCount);
				
		// TODO Auto-generated method stub

	}

}
