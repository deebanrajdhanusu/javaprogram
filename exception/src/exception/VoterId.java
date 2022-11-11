package exception;

public class VoterId {

	public static void main(String[] args) throws AgeException {
		int age=17;
		if(age>18) {
			System.out.println("eligible to vote");
		}
		else {
			AgeException a= new AgeException("not eligible");
			throw a;
		}
		
		

	}

}
