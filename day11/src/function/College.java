package function;

public class College {
	String name;
	int fees;
	public String findFees(College []a) {
		int temp=a[0].fees;
		College temp1=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].fees>=temp) {
				temp=a[i].fees;
				temp1=a[i];
			}
		}
		return("college= "+temp1.name+" fees= "+temp1.fees);
	}

}
