package looping;

public class PrintCharacterCount {
	public static void main(String []args) {
		String a="OneSofT@731#";
		String upper="";
		String lower="";
		int l=0;
		int u=0;
		int n=0;
		int s=0;
		for (int i=0;i<a.length();i++) {
		if (a.charAt(i)>='a'&&a.charAt(i)<='z') {
			lower=lower+a.charAt(i);
			System.out.print(" "+a.indexOf(a.charAt(i)));
			l++;
		}
		else if (a.charAt(i)>='A'&&a.charAt(i)<='Z') {
			upper=upper+a.charAt(i);
			System.out.print(" "+a.indexOf(a.charAt(i)));
			u++;
		}
		else if (a.charAt(i)>='0'&&a.charAt(i)<='9') {
			
			n++;
		}
		else {
			s++;
		}
		}
		System.out.println("\n");
		System.out.println(l +" "+u+" "+n+" "+s);
		System.out.println("lower case: "+lower);
		System.out.println("upper case: "+upper);
	}

}
