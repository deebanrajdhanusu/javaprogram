package collection3;

public class Student {
	private String name;
	private int rollNo;
	private String gender;
	private String depart;
	
	public Student(String a,int b,String c,String d) {
		name=a;
		rollNo=b;
		gender=c;
		depart=d;
	}
	public String toString() {
		return (name+" "+gender+" "+depart+" "+rollNo);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
