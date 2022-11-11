package lmsbasics;

public class Test {

	public static void main(String[] args) {
		String word=args[0];
		String []value=word.split("-");
		System.out.println(value[0].charAt(value[0].length()-1));
		System.out.println(value[1].substring(1, 4));
		
		
		
		// TODO Auto-generated method stub

	}

}
