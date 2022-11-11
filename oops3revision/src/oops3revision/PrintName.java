package oops3revision;

public class PrintName {
	public void startsWithS(String a[]) {
		for(String x:a) {
			if(x.startsWith("s")) {
				System.out.println(x);
			}
		}
	}
	public void startsWithR(String a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i].startsWith("r")) {
				System.out.println(a[i]);
			}
		}
	}
	public void findLength(String a[]) {
		for(String x:a) {
			System.out.println(x+"-"+x.length());
		}
	}

}
