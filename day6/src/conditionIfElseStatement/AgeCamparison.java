package conditionIfElseStatement;

public class AgeCamparison {

	public static void main(String[] args) {
		int age1=15;
		int age2=12;
		int age3=36;
		int age4=24;
		if (age1>age2&age1>age3&age1>age4) {
			System.out.println("age1 is elder");
		}
		if (age2>age1&age2>age3&age2>age4) {
			System.out.println("age2 is elder");
		}
		if (age3>age1&age3>age2&age3>age4) {
			System.out.println("age3 is elder");
		}
		else  {
			System.out.println("age4 is elder");
		}
			
		// TODO Auto-generated method stub

	}

}
