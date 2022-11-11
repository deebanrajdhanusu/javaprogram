package opps2;

public class Icici extends Rbi {
	public int getInterest(int amount,int interest) {
		return amount+interest;
	}
	public void display() {
		System.out.println(super.getInterest(5000, 500));
	}

}
