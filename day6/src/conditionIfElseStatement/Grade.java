package conditionIfElseStatement;

public class Grade {

	public static void main(String[] args) {
		int mark=96;
		if(mark>=91&mark<=100) {
			System.out.println("s grade");
		}
		else if(mark>=81&mark<=90) {
			System.out.println("a grade");
		}
		else if(mark>=71&mark<=80) {
			System.out.println("b grade");
		}
		else if(mark>=61&mark<=70) {
			System.out.println("c grade");
		}
		else if(mark>=51&mark<=60) {
			System.out.println("e grade");
		}
		else {
			System.out.println("invalid input");
		}
		// TODO Auto-generated method stub

	}

}
