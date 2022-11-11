package collection3;
import java.util.*;
import java.util.stream.Collectors;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1=new Laptop("lenovo",80000,"white",true); 
		Laptop l2=new Laptop("dell",65000,"ash",true);
		Laptop l3=new Laptop("microsoft",130000,"silver",true);
		Laptop l4=new Laptop("apple",140000,"silver",false);
		Laptop l5=new Laptop("hp",70000,"black",false);
		Laptop l6=new Laptop("acer",40000,"grey",false);
		
		HashMap<String,Laptop>laptops=new HashMap<>();
		laptops.put(l1.getBrand(), l1);
		laptops.put(l2.getBrand(), l2);
		laptops.put(l3.getBrand(), l3);
		laptops.put(l4.getBrand(), l4);
		laptops.put(l5.getBrand(), l5);
		laptops.put(l6.getBrand(), l6);

		/*Map<String,Laptop>laptops1=laptops.values().stream().filter(x->x.getPrice()>50000).collect(Collectors.toMap(x->x.getBrand(), x->x));
		System.out.println(laptops1);
		long a=laptops1.keySet().stream().count();
		System.out.println(a);
		List<String>laptops2;
		laptops2=laptops.values().stream().filter(x->x.getPrice()<50000).map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println(laptops2);
		long b=laptops2.stream().count();
		System.out.println(b);*/
		laptops.values().stream().filter(x->x.getPrice()<80000).forEach(x->System.out.println(x));
		

	}

}
