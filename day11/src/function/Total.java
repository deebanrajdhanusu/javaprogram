package function;

public class Total {
	public String findTotal(int a,int b,int c,int d) {
		return("total="+(a+b+c+d));
	}
	public static void main(String []args) {
		Total a=new Total();
		System.out.println(a.findTotal(60, 80, 82, 67));
		
	}

}
