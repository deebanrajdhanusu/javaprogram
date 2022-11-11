package function;

public class FindStringMin {
	public String findString(String[]a) {
		int min=a[0].length();
		String temp="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<=min) {
				min=a[i].length();
				temp=a[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		FindStringMin a=new FindStringMin();
		String []words= {"ram","raj","raja","suresh","kavitha"};
		System.out.println(a.findString(words));

	}

}
