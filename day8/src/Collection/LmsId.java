package Collection;

import java.util.ArrayList;

public class LmsId {
	public static void main(String[] args) {
		ArrayList<Integer> lms=new ArrayList<>();
		lms.add(36);
		lms.add(20);
		lms.add(23);
		lms.add(47);
		lms.add(25);
		lms.set(0,200);
		lms.remove(0);
		for(int i=0;i<lms.size();i++) {
			System.out.println(lms.get(i));
		}
		
		
		/*for(Integer a:lms) {
			System.out.println(a);
		}*/
		
		
		/*lms.forEach(x->System.out.println(x));*/
		
		
		/*for(int i=0;i<lms.size();i++) {
			if(i%2==0) {
				System.out.println(lms.get(i)+"even");
			}
			else {
				System.out.println(lms.get(i)+"odd");
			}*/
		
		
		/*int max=0;
		for(Integer id:lms) {
			if(id >= max) {
				max=id;
			}
		
		}
		System.out.println(max);*/
		
		
		
		/*int min=lms.get(1);
		for(int i=0;i<lms.size();i++) {
			if(lms.get(i)<=min) {
				min=lms.get(i);
				
			}
		}
		
		System.out.println(min);*/
		
		
		
	}

}
