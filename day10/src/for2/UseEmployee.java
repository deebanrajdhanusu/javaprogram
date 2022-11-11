package for2;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		
		emp1.name="nishanthi";
		emp1.age=28;
		emp1.isMale=false;
		emp1.salary=6000;
		
		emp2.name="shanthini";
		emp2.age=29;
		emp2.isMale=false;
		emp2.salary=8000;
		
		emp3.name="ram";
		emp3.age=26;
		emp3.isMale=true;
		emp3.salary=16000;
		
		emp4.name="raj";
		emp4.age=22;
		emp4.isMale=true;
		emp4.salary=18000;
	
		
		Employee []a= {emp1,emp2,emp3,emp4};
		
		for(int i=0;i<a.length;i++) {
			if(a[i].isMale==false) {
				//System.out.println(a[i].name);
		
		}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i].salary>10000) {
				//System.out.println(a[i].name);
			}
		}
		for(Employee x:a) {
			if(x.name.startsWith("v")) {
				//System.out.println(x.name);
			}
		}
		for(Employee x:a) {
			if(x.age<=22) {
				//System.out.println(x.name);
			}
		}
		int c=a[0].age;
		String d="";
		for(Employee x:a) {
			if(x.age<c) {
				c=x.age;
				d=x.name;
			}
		}
		System.out.println(d);
		


	}

	}
