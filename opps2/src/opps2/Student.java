package opps2;

public class Student {
	public String subjects(int science,int english) {
		return "total "+science+english;
	}
	public String subjects(float science,float english) {
		return "total "+science+english;
	}
	public String subjects(String subjects) {
		if(subjects.equals("maths")) {
			return "maths subject";
		}
		else {
			return "is not maths subject";
		}
	}
	public static void main(String []args) {
		Student s=new Student();
		System.out.println(s.subjects(80,90));
		System.out.println(s.subjects(78.4f,67.9f));
		System.out.println(s.subjects("maths"));
	}

}
