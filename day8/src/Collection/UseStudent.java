package Collection;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student a=new Student("sathish",17,344,'A',true);
		Student b=new Student("vanaja",23,575,'B',false);
		Student c=new Student("Thenmozhi",21,678,'C',false);
		Student d=new Student("kumar",24,979,'D',true);
		
		ArrayList<Student> val=new ArrayList<>();
		val.add(a);
		val.add(b);
		val.add(c);
		val.add(d);
		/*for(int i=0;i<val.size();i++) {
			System.out.println(val.get(i));
		}*/
		
		
		/*for(Student num:val) {
			System.out.println(num);
		}*/
		
		
		/*val.forEach(x->System.out.println(x));*/
		
		/*for(int i=val.size()-1;i>=0;i--) {
			System.out.println(val.get(i));
		}*/
		
		
		
		
		
		
		/*for(int i=0;i<val.size();i++) {
			if(val.get(i).getName().contains("a")||val.get(i).getName().contains("e")||val.get(i).getName().contains("i")||val.get(i).getName().contains("o")||val.get(i).getName().contains("u")) {
				System.out.println(val.get(i).getName()+"is vowels ");
			}
			else {
				System.out.println(val.get(i).getName()+"is not vowels ");
				
			}
		}*/
		
		
		
		
		
		int min=a.getAge();
		String n="";
		for(Student x:val) {
			if(x.getAge() < min) {
				
				n=x.getName();
			}
			
		}
		System.out.println(n);
			
		
		
		
		/*val.forEach(s-> {
			if(s.getAge()>=18) {
			
		System.out.println(s.getName());
		}			
		});*/
		
		
		
		/*val.forEach(z-> {
			
		if(z.getSection()=='A') {
			System.out.println(z);	
		}
		});*/
		
		
		
		
		/*ArrayList<Student> female=new ArrayList<>();
		for(Student v:val) {
			if(v.isMale()!=true) {
				female.add(v);
			}
		}
		female.forEach(m->System.out.println(m));*/
		
		
		
		/*ArrayList<Student> details=new ArrayList<>();
		for(Student q:val) {
			if(q.getName().length()>=4) {
				details.add(q);
			}
		}
			details.forEach(o->System.out.println(o));*/
			
		
				}
	}


