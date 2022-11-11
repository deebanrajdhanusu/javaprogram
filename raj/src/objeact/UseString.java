package objeact;

public class UseString {

	public static void main(String[] args) {
		String name="prasanth";
		String name1="rajkumar";
		String name2="World Wide Wonder";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(3));
		System.out.println(name.concat(name1));
		System.out.println(name.charAt(5));
		boolean startWith=name.startsWith("p");
		boolean endsWith=name1.endsWith("ku");
		boolean isEqual=name.equals("Prasanth");
		boolean isEqualIgnoreCase=name.equalsIgnoreCase("wide");
		boolean checkCharacter=name2.contains("de");
		int indexValue=name1.indexOf("k");
		String[]a=name2.split(" ");
		char []b=name2.toCharArray();
		System.out.println(checkCharacter);
		System.out.println(isEqualIgnoreCase);
		System.out.println(b[2]);
		System.out.println(a[1]);
		System.out.println(name1.length());
		System.out.println(startWith);
		System.out.println(endsWith);
		System.out.println(isEqual);
		System.out.println(indexValue);
		
		
		// TODO Auto-generated method stub

	}

}
