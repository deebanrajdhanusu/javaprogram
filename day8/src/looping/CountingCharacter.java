package looping;

public class CountingCharacter {

	public static void main(String[] args) {
		String a="nisHAnThinI@123";
		int lower=0,upper=0,special=0,number=0;
		for (int i=0;i<a.length();i++) {
			if (a.charAt(i)>='a'&&a.charAt(i)<='z') {
				lower++;
			}
			else if (a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				upper++;
			}
			else if (a.charAt(i)>=0&&a.charAt(i)<=9) {
				number++;
			}
			else {
				special++;
			}
		}
		System.out.println(lower+" "+upper+" "+number+" "+special);
		// TODO Auto-generated method stub

	}
//97 122 65 90 48 57
}
