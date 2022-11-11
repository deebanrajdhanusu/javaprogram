package exception;

public class Demo2 {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}

	public static void main(String[] args) {
		Demo2 a=new Demo2();
		try {
			a.findA();
		}
		catch (Exception e) {
			System.out.println("overflow");
		}
		
		

	}

}
