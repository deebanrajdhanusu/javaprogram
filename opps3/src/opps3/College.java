package opps3;

public class College extends University {
	public void examDate() {
		System.out.println("exam starts from jan 2023");
	}
	public String onTime(int time) {
		if(time<=9) {
			return "on time";
		}
		else {
			return "late";
		}
	}
	public String examResult(int a) {
		if(a>35) {
			return "pass";
		}
		else {
			return "fail";
		}
	}

}
