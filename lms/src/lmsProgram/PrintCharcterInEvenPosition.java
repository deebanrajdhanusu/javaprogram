package lmsProgram;

public class PrintCharcterInEvenPosition {

	public static void main(String[] args) {
		String word=args[0];
		for(int i=0;i<word.length();i++) {
			if(i%2==0) {
				System.out.print(word.charAt(i));
			}
		}
		// TODO Auto-generated method stub

	}

}
