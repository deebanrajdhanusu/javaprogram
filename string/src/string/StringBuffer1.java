package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		String a="ramkumar";
		StringBuffer b=new StringBuffer(a);
		b=b.reverse();
		System.out.println(b);
		b=b.append("ram");
		System.out.println(b);

	}

}
