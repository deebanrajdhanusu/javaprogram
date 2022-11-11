package lmsbasics;

public class Operation {

	public static void main(String[] args) {
		String num1=args[0];
		String num2=args[1];
		String []num3=num1.split(",");
		String[]num4=num2.split(",");
		int a=Integer.parseInt(num3[0]);
		int b=Integer.parseInt(num3[1]);
		int c=Integer.parseInt(num4[0]);
		int d=Integer.parseInt(num4[1]);
		int e=a+d;
		int f=b+c;
		System.out.println(e*f);
	
		// TODO Auto-generated method stub

	}

}
