package collection3;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("dhinesh",111,"male","mech");
		Student s2=new Student("suriya",110,"male","ece");
		Student s3=new Student("dhivya",112,"female","cse");
		Student s4=new Student("ashwini",113,"female","eee");
		Student s5=new Student("devayani",114,"female","ece");
		Student s6=new Student("ragav",115,"male","cse");
		Student s7=new Student("madhavan",116,"male","civil");
		Student s8=new Student("prakash",117,"male","mech");
		
		ArrayList<Student>students=new ArrayList<>();
		/*List std=new ArrayList();
		std.add("sudha");
		std.add(263);*/
		//System.out.println(std);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		/*for(Student x:students) {
			if(x.getRollNo()%2==0) {
				System.out.println(x);
			}
		}
		students.forEach(x->{if(x.getRollNo()%2==0) {
			System.out.println(x);
		}
			});
		students.stream().filter(x->x.getRollNo()%2==0).forEach(x->System.out.println(x));
		long a=students.stream().filter(x->x.getRollNo()%2==0).count();
		System.out.println(a);
		List<Student>st=students.stream().filter(x->x.getRollNo()%2==0).collect(Collectors.toList());
		System.out.println(st);
		List<String>st=students.stream().filter(x->x.getRollNo()%2==0).map(x->x.getName()).collect(Collectors.toList());
		List<Student>st=students.stream().filter(x->x.getRollNo()%2==0).collect(Collectors.toList());
		System.out.println(st);*/
		Map<Integer,Student>m=students.stream().filter(x->x.getRollNo()%2==0).collect(Collectors.toMap(x->x.getRollNo(), x->x));
		System.out.println(m);
		


	}

}
