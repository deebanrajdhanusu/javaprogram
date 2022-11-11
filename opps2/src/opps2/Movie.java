package opps2;

public class Movie {
	
	public String theater(float a) {
		if(a>4) {
			return "good movie";
		}
		else {
			return "average movie";
		}
	}
	public String theater(String a) {
		if(a.equals("kanam")) {
			return "same";
		}
		return "not same";
	}
	public static void main(String []args) {
		Movie m=new Movie();
		System.out.println(m.theater(4.4f));
		System.out.println(m.theater("aaa"));
	}

}
