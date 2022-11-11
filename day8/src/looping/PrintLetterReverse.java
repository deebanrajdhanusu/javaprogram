package looping;

public class PrintLetterReverse {

	public static void main(String[] args) {
		String word= "onesoft";
		for(int i=word.length()-1;i>=0;i--) {
			for (int j=0;j<=word.length();j++) {
				System.out.println();
			}
			System.out.println(word.charAt(i));
		}
		// TODO Auto-generated method stub

	}

}
