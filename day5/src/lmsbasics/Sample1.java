package lmsbasics;

public class Sample1 {

	public static void main(String[] args) {
		String []details=args[0].split(",");
		String name=details[0];
		int rollNumber=Integer.parseInt(details[1]);
		long number=Long.parseLong(details[2]);
		String mailId=details[3];
		boolean present=Boolean.parseBoolean(details[4]);
		System.out.println("Nmae= "+name+" number= "+number+" MailID= "+mailId+" IsPresent= "+present);
		
		
		// TODO Auto-generated method stub

	}

}
