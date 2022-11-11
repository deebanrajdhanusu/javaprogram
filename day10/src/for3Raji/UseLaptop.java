package for3Raji;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1= new Laptop();
		laptop1.brand ="Dell";
		laptop1.colour = "grey";
		laptop1.price = 50000;
		laptop1.isWarranty = true;
		Laptop laptop2 = new Laptop();
		laptop2.brand = "lenovo";
		laptop2.colour = "black";
		laptop2.price= 45000;
		laptop2.isWarranty= false;
		Laptop laptop3 = new Laptop();
		laptop3.brand = "hp";
		laptop3.colour = "white";
		laptop3.price= 40000;
		laptop3.isWarranty= false;
		Laptop laptop4 = new Laptop();
		laptop4.brand = "acer";
		laptop4.colour = "black";
		laptop4.price= 42000;
		laptop4.isWarranty= true;
		Laptop [] laps = {laptop1,laptop2,laptop3,laptop4};
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand);
		}
		for(Laptop l:laps) {
			System.out.println(l.price);
		}
	}

}
