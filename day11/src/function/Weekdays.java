package function;

public class Weekdays {
	public void findWeekdays(String a) {
		switch(a) {
		case "monday": 
			System.out.println("weekdays");
			break;
		case "tuesday":
			System.out.println("weekdays");
			break;
		case "wednesday":
			System.out.println("weekdays");
			break;
		case "thursday":
			System.out.println("weekdays");
			break;
		case "friday":
			System.out.println("weekdays");
			break;
			default :
				System.out.println("weekend");
	
		}
	}
	public static void main(String []args) {
		Weekdays a=new Weekdays();
		a.findWeekdays("saturday");
	}

}
