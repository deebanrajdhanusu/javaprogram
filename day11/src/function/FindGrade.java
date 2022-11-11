package function;

public class FindGrade {
	public void findGrade(int a) {
		if(a>90&&a<=100) {
			System.out.println("A grade");
		}
		else if(a>80&&a<=90) {
			System.out.println("B grade");
		}
		else if(a>70&&a<=80) {
			System.out.println("c grade");
		}
		else if(a>60&&a<=70) {
			System.out.println("d grade");
		}
		else if(a>50&&a<=60) {
			System.out.println("e grade");
		}
		else {
			System.out.println("fail");
		}
	}
	public static void main(String []args) {
		FindGrade a=new FindGrade();
		a.findGrade(90);
	}

}
