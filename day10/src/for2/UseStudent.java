package for2;

public class UseStudent {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student student4=new Student();
		Student student5=new Student();
		
		student1.name="nishanthi";
		student1.age=18;
		student1.rollno=15;
		student1.isPresent=true;
		student1.grade='a';
		
		student2.name="shanthini";
		student2.age=19;
		student2.rollno=8;
		student2.isPresent=false;
		student2.grade='s';
		
		student3.name="raj";
		student3.age=17;
		student3.rollno=4;
		student3.isPresent=true;
		student3.grade='b';
		
		student4.name="ram";
		student4.age=20;
		student4.rollno=21;
		student4.isPresent=false;
		student4.grade='c';
		
		student5.name="vijay";
		student5.age=18;
		student5.rollno=9;
		student5.isPresent=true;
		student5.grade='a';
		
		Student []a= {student1,student2,student3,student4,student5};
		
		for(int i=0;i<a.length;i++) {
			if(a[i].grade=='a') {
				//System.out.println(a[i].name+" "+a[i].age+" "+a[i].rollno+" "+a[i].isPresent+" "+a[i].grade);
			}
		}
		
		for(Student x:a) {
			if(x.isPresent) {
				//System.out.println(x.name);
			}
		}
		String b=a[0].name;
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i].name.length()>b.length()) {
				b=a[i].name;
				index=i;
			}
		}
		//System.out.println(a[index].name+" "+a[index].age+" "+a[index].rollno+" "+a[index].isPresent+" "+a[index].grade);
		
		for(int i=0;i<a.length;i++) {
			if(a[i].rollno>1&&a[i].rollno<10) {
				//System.out.println(a[i].name+" "+a[i].age+" "+a[i].rollno+" "+a[i].isPresent+" "+a[i].grade);
			}
		}
		

	}

}
