package looping;

public class FindPalindrome {

	public static void main(String[] args) {
		String value="malayalam";
		String template="";
		for (int i=value.length()-1;i>=0;i--) {
			template=template+value.charAt(i);
		}
		if (value.equalsIgnoreCase(template)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
