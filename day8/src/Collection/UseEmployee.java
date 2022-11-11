package Collection;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee employee1=new Employee("sathish","A423",30,34000,true,"Production manager");
		Employee employee2=new Employee("vanaja","H463",26,20000,false,"Receptionist");
		Employee employee3=new Employee("kumar","R623",27,21000,true,"Data Analyst");
		Employee employee4=new Employee("Thenmozhi","J423",24,19000,false,"TL");
		Employee employee5=new Employee("saravanan","E423",22,16000,true,"CL");
		
		
		ArrayList<Employee> details=new ArrayList<>();
		
		details.add(employee1);
		details.add(employee2);
		details.add(employee3);
		details.add(employee4);
		details.add(employee5);
		
		/*for(int i=0;i<details.size();i++) {
		
				System.out.println(details.get(i).getEmpName().charAt(details.get(i).getEmpName().length()-1));
			}*/
		
		
		
		/*ArrayList<Employee> sam=new ArrayList<>();
		
		for(Employee v:details) {
			if(v.getEmpSalery()>30000) {
				sam.add(v);
				
			}
		}
		
		sam.forEach(m->System.out.println(m));*/
		
		
		/*ArrayList<Employee> Role=new ArrayList<>();
		for(Employee x:details) {
			if(x.getEmpRole().equalsIgnoreCase("Production manager")) {
				Role.add(x);
			}
		}
		
		Role.forEach(k->System.out.println(k));*/
		
		
		
		/*ArrayList<Employee> op=new ArrayList<>();
		
		for(Employee bb:details) {
			if(bb.getEmpName().startsWith("s")) {
				op.add(bb);
			}
			
		}
		
		op.forEach(j->System.out.println(j));*/
		
		
		
		/*details.forEach(kl-> { 
			
		if(.getEmpName().startsWith("s"))
			
		});*/
		
		
		/*for(int i=0;i<details.size();i++) {
			if(details.get(i).isEmpIsMale()!=true) {
				System.out.println(details.get(i));
				
			}
		}*/
		
		
		
		int max=details.getEmpSalery(1);
		String name="";
		for(Employee vv:details) {
			if(vv.getEmpSalery()<=max) {
				max=vv.getEmpSalery();
				name=vv.getEmpName();
				
			}
		}
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	

}
