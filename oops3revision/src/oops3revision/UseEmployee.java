package oops3revision;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("raj",001,18000,"production");
		Employee e2=new Employee("raghav",002,20000,"Qc");
		Employee e3=new Employee("prasanth",003,25000,"production supervisor");
		Employee e4=new Employee("prem",004,30000,"R&D");
		Employee e5=new Employee("suresh",005,15000,"testing");
		Employee []employees= {e1,e2,e3,e4,e5};
		System.out.println(e1.getHighSalary(employees));
		e1.findSalaryExperience(2);
		// TODO Auto-generated method stub

	}

}
