package exception;

public class TwoCharacter {

	public static void main(String[] args) {
		String a="sainathar";
		char d[]=a.toCharArray();

		for(int i=0;i<a.length();i++) {
			char c=0;
			//char b=a.charAt(i);
			for(int j=i+1;j<a.length();j++) {
				if(d[i]==d[j]) {
					c=d[i];
				}
			}
			System.out.println(c);
		}
		

	}

}
