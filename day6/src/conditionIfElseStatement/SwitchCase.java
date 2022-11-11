package conditionIfElseStatement;

public class SwitchCase {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		String cal="addition";
		switch(cal) {
		case "subraction" :
			System.out.println(num1-num2);
			break;
		case "addition" :
			System.out.println(num1+num2);
			break;
		case "multiplication" :
			System.out.println(num1*num2);
			break;
		case "division" :
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("invalid");
		}
		// TODO Auto-generated method stub

	}

}
