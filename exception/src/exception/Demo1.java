package exception;

public class Demo1 {

	public static void main(String[] args) {
		//String a="py-01";
		//int c=263;
		//String d=c+" ";
		//System.out.println(d);
		
		/*float b;
		b=Float.parseFloat(a);
		try {
		 b=Float.parseFloat(a);
		System.out.println(b);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}*/
		String a="raj";
		try {
			char b=a.charAt(3);
			System.out.println(b);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		int c[]= {3,9,5,7,3,5};
		try {
			System.out.println(c[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	
		

	}

}
