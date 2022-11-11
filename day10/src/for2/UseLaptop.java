package for2;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop();
		Laptop laptop3=new Laptop();
		Laptop laptop4=new Laptop();
		
		laptop2.brand="lenovo";
		laptop2.price=25000;
		laptop2.color="black";
		laptop2.isTouchable=false;
		
		laptop3.brand="hp";
		laptop3.price=30000;
		laptop3.color="grey";
		laptop3.isTouchable=true;
		
		laptop1.brand="dell";
		laptop1.price=35000;
		laptop1.color="red";
		laptop1.isTouchable=true;
		
		laptop4.brand="acer";
		laptop4.price=40000;
		laptop4.color="orange";
		laptop4.isTouchable=true;
		
		Laptop[]laps=new Laptop[4];
		laps[0]=laptop1;
		laps[1]=laptop2;
		laps[2]=laptop3;
		laps[3]=laptop4;
		
		/*for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+" "+laps[i].price);
		}*/
		for(int i=laps.length-1;i>=0;i--) {
			System.out.println(laps[i].brand+" "+laps[i].price);
		}
		// TODO Auto-generated method stub

	}

}
