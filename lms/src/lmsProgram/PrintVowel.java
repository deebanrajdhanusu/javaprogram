package lmsProgram;

public class PrintVowel {

	public static void main(String[] args) {
		String a[]= {"ram","raj","ssh"};
		String b[]= {"a","e","i","o","u"};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i].contains(b[j])) {
					System.out.println("vowel");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
