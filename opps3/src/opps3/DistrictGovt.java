package opps3;

public class DistrictGovt extends StateGovt { 
	public String noPlateNumber(int num) {
		if(num>=0&&num<=9) {
			return "valid registration no";
		}
		else {
			return "invalid no";
		}
	}
	public String Shape(String a) {
		if(a.equals("rectangle")) {
			return "correct shape";
		}
		else {
			return "incorrect shape";
		}
	}
	public String platecolor(String color) {
		if(color.equals("black&white")) {
			return "tamilnadu number plate color";
		}
		else {
			return "not tamilnadu";
		}
	}

}
