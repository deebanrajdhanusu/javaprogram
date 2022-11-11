package function;

public class FindEvenNumber {
	public String findNumber(int a) {
		if(a%2==0) {
			return("it is even number");
		}
		else {
			return("it is odd number");
		}
	}
	public static void main(String []args) {
		FindEvenNumber a=new FindEvenNumber();
		System.out.println(a.findNumber(7));
		
	}

}
