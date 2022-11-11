package function;

public class FindLength1 {
	public int findLength(String a) {
		return (a.length());
	}
	public String findReverse(String a) {
		String rev="";
		for(int i=a.length()-1;i>=a.length()/2;i--) {
			rev=rev+a.charAt(i);
		}
		return rev;
	}
	public int evenCount(int []a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	public String findPrime(int a) {
		boolean isPrime=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				isPrime=false;
				
			}
		}
		if(isPrime==true) {
			return ("Is prime");
		}
		else {
			return ("not prime");
		}
	}

	public static void main(String[] args) {
		int []c= {2,25,20,50,29};
		
		String a=args[0];
		
		FindLength1 b=new FindLength1();
		
		System.out.println(b.findLength(a));
		System.out.println(b.findReverse(a));
		System.out.println(b.evenCount(c));
		System.out.println(b.findPrime(17));
		

	}

}
