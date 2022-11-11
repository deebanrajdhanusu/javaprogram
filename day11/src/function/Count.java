package function;

public class Count {
	public void findCount(int a[]) {
		int e=0;
		int o=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("odd count= "+o+" even count= "+e);
	}
	

	public static void main(String[] args) {
		int a[]= {3,5,19,35,55};
		
		// TODO Auto-generated method stub

	}

}
