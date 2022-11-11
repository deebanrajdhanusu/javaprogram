package conditionIfElseStatement;

public class Plural {

	public static void main(String[] args) {
		String a="onesofts";
		int b=a.charAt(a.length()-1);
		if(b=='s'|b=='S') {
			System.out.println("plural");
			
		}
		else {
			System.out.println("not plural");
		}
		if(a.endsWith("s")) {
			System.out.println("plural");
		}
		else {
			System.out.println("not plural");
		}
		// TODO Auto-generated method stub

	}

}
