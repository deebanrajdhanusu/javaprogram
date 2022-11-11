package opps3;

public abstract class StateGovt {
	public abstract String platecolor(String color);
	public String code(String stateCode) {
		if(stateCode.equals("TN")) {
			return "tamilnadu";
		}
		else {
			return "not tamilnadu";
		}
	}
	public void noPlate() {
		System.out.println("need plate");
	}

}
