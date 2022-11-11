package conditionRevision;

public class Sample {

	public static void main(String[] args) {
		String a="nisha";
		int b=a.length();
		if (b%2==0) {
			System.out.println(a.substring(0,b/2)+"-"+a.substring(b/2));
			
		}
		else {
			System.out.println(a.substring(0,b/2)+"-"+a.charAt(b/2)+"-"+a.substring(b/2+1));
			
		}
		// TODO Auto-generated method stub

	}

}
