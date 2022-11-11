package looping;

	public class PrintCharacter {
		public static void main(String []args) {
			String a="OneSoFt";
			int u=0;
			int l=0;
			int n=0;
			for (int i=0;i<a.length();i++) {
			if (a.charAt(i)>='a'&&a.charAt(i)<='z') {
				l++;
			}
			else if (a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				u++;
			}
			else {
				n++;
			}
			}
			System.out.println(l +" "+u+" "+n);
		}

	}



