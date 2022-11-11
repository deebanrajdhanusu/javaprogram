package for3Raji;

public class UseEmployee {
public static void main(String[]args) {
	Employee emp1= new Employee();
	emp1.name="Raji";
	emp1.id=950;
	emp1.designation="Trainee";
	emp1.isOnRole= true;
	emp1.salary= 22000;
	Employee emp2= new Employee();
	emp2.name="Ragul";
	emp2.id=940;
	emp2.designation="Trainer";
	emp2.isOnRole= true;
	emp2.salary= 25000;
	Employee emp3= new Employee();
	emp3.name="vimal";
	emp3.id=935;
	emp3.designation="Manager";
	emp3.isOnRole= true;
	emp3.salary= 50000;
	Employee[] xy = {emp1,emp2,emp3};
	Employee max = xy[0];
	for(Employee e:xy) {
		if(e.salary>=max.salary) {
			max = e;
		}
	}
	System.out.println(max.name+" "+max.id+" "+max.designation+" "+max.isOnRole+" "+max.salary);
	
	
}
}
