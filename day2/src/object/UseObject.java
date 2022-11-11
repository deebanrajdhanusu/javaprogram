package object;

public class UseObject {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="dell";
		l1.price=53000;
		l1.color="grey";
		l1.isTouchScreen=false;
		System.out.println(l1.color+" "+l1.brand+" "+l1.price+" "+l1.isTouchScreen);
		Laptop l2=new Laptop();
		l2.brand="acer";
		l2.price=52000;
		l2.color="white";
		l2.isTouchScreen=true;
		System.out.println(l2.color+" "+l2.brand+" "+l2.price+" "+l2.isTouchScreen);
		Laptop l3=new Laptop();
		l3.brand="apple";
		l3.price=120000;
		l3.color="ash";
		l3.isTouchScreen=false;
		System.out.println(l3.color+" "+l3.brand+" "+l3.price+" "+l3.isTouchScreen);
		// TODO Auto-generated method stub

	}

}
