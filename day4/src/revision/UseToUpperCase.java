package revision;

public class UseToUpperCase {

	public static void main(String[] args) {
		String name="ramesh";
		String name1=name.toUpperCase();
		System.out.println(name1);
		String name2=name1.toLowerCase();
		System.out.println(name2);
		int length=name.length();
		System.out.println(length);
		String concatenation=name.concat(name1);
		System.out.println(concatenation);
		boolean contains=concatenation.contains("one");
		System.out.println(contains);
		boolean startwith=concatenation.startsWith("ra");
		System.out.println(startwith);
		boolean endswith=concatenation.endsWith("esh");
		System.out.println(endswith);
		boolean equals=name.equals(name1);
		System.out.println(equals);
		boolean equalsIgnoreCase=name.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		int indexOf=name.indexOf("s");
		System.out.println(indexOf);
		char characters=name.charAt(2);
		System.out.println(characters);
		String substring=concatenation.substring(0,8);
		System.out.println(substring);
		char []names=concatenation.toCharArray();
		System.out.println(names[8]);
		String[]split=name.split("a");
		System.out.println(split[1]);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
