
public class PrintVowel {

	public static void main(String[] args) {
		String value="onesoft";
		char []a=value.toCharArray();
		int v=0;
		for(int i=0;i<value.length();i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				v++;
				
			}
			
		}
		System.out.println(v);
		// TODO Auto-generated method stub

	}

}
