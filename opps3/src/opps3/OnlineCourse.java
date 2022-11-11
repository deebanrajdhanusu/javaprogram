package opps3;

public class OnlineCourse implements Course {
	public String showCourseId(int id) {
		if(id==2) {
			return "mech";
		}
		else {
			return "not mech";
		}
	}
	public String showCourseName(String name) {
		if(name.equals("civil")) {
			return "civil";
		}
		else if(name.equals("mech")) {
			return "mech";
		}
		else if(name.equals("cse")) {
			return "cse";
		}
		else {
			return "no department like that";
		}
	}
	public void showTrainerName(String name) {
		System.out.println(name);
	}
	public void showUrl(String link) {
		System.out.println(link);
	}

}
