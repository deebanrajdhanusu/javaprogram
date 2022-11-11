package lmsProgram;
//import java.util.*;

public class Incrementby5 {
	static int z;
	
	    public static void step(){
	    	z=5;
	        for(int i=100;i>1;i--){
	            if(i%5==0){
	               System.out.println(i);
	            }
	        }
	        
	    }
	    public static int fact1(int a) {
	    	int fact=1;
	    	for(int i=1;i<=a;i++) {
	    		fact=fact+i;
	    	}
	    	return fact;
	    }
	    public static int square(int a) {
	    	int b=0;
	    	for(int i=0;i<=a;i++) {
	    		b=b+i;
	    	}
	    	return b;
	    }
	    public static int fact2(int a) {
	    	return a+a+a;
	    }
	    
	

	public static void main(String[] args) {
		   step();
		   int []a= {1,5,8,10};
		   int b=5;
		   for(int x:a) {
			   System.out.println(x);
		   }
		  // while(b>0) {
			   //System.out.println(b);
			  // b++;
		  // }
		   int c=3;
		   int d=100;
		   for(int i=1;i<=d;i++) {
			  //for(int j=c;j>0;j++) {
				   System.out.println(i+"*"+c+"="+fact2(i));
			   //}
		   }
		   System.out.println(square(3));
	

	}

}
