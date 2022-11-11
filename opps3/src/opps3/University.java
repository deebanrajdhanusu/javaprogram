package opps3;

public abstract class University {
	public abstract void examDate();
	public abstract String examResult(int a);
	public String examEligibility(int a) {
		if(a>60) {
			return "eligible";
		}
		else {
			return "not eligible";
		}
	}

}
