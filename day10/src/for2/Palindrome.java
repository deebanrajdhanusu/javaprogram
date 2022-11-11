package for2;

public class Palindrome {

	public static void main(String[] args) {
		String a="ram";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		// TODO Auto-generated method stub

	}

}
