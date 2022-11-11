package function;

public class Average {
	public void findAverage(int a,int b,int c,int d) {
		System.out.println("average="+(a+b+c+d)/4);
	}
	public static void main(String []args) {
		Average a=new Average();
		a.findAverage(60, 70, 75, 88);
	}

}
