package lmsProgram;

public class PrintElementMoreThan50 {

	public static void main(String[] args) {
		String []a=args[0].split(",");
		int []b= {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3])};
		for(int i=0;i<b.length;i++) {
			if(b[i]>50) {
				System.out.println(b[i]);
			}
			else {
				System.out.println(b[i]*b[i]);
			}
		}

	}

}
