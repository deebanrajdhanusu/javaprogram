package oops3revision;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String department;
	public Employee(String name,int id,int salary,String department) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.department=department;
	}
	public String getHighSalary(Employee []a) 
	{
		int temp=0;
		Employee b=a[0];
		for(Employee x:a) {
			if(x.salary>temp) {
				temp=x.salary;
				b=x;
			}
		}
		return (b.name+" "+b.id+" "+b.department+" "+b.salary+" "+"\n"+b.name.charAt(0)+" "+"\n"+b.department.charAt(b.department.length()-1));
		
	}
	public void findSalaryExperience(int a) {
		switch (a) {
		case 1: 
			System.out.println(15000);
			break;
		case 2:
			System.out.println(20000);
			break;
		case 3:
			System.out.println(24000);
			break;
		case 4:
			System.out.println(30000);
			break;
		default :
			System.out.println("above 30000");
			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
