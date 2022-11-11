package collection3;
import java.util.*;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile("samsung",80000,"white",true,8);
		Mobile m2=new Mobile("apple",120000,"silver",false,8);
		Mobile m3=new Mobile("microsoft",85000,"purple",false,12);
		Mobile m4=new Mobile("sony",70000,"ash",true,4);
		Mobile m5=new Mobile("oneplus",40000,"black",true,6);
		HashMap<String,Mobile>mobiles=new HashMap<>();
		mobiles.put(m1.getBrand(), m1);
		mobiles.put(m2.getBrand(), m2);
		mobiles.put(m3.getBrand(), m3);
		mobiles.put(m4.getBrand(), m4);
		mobiles.put(m5.getBrand(), m5);
		for(String x:mobiles.keySet()) {
			if(mobiles.get(x).getPrice()>50000) {
				//System.out.println(mobiles.get(x));
			}
		}
		for(Mobile x:mobiles.values()) {
			if(x.getPrice()>50000) {
				//System.out.println(x);
			}
		}
		mobiles.values().stream().filter(x->x.getRam()>6).forEach(x->System.out.println(x));
		Map<String,Mobile>mobiles1=mobiles.values().stream().filter(x->x.getRam()>6).collect(Collectors.toMap(x->x.getBrand(), x->x));
		System.out.println(mobiles1);
		/*Iterator<Mobile>itr=mobiles.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getRam()==8) {
				itr.remove();
			}
		}
		mobiles.values().forEach(x->System.out.println(x));*/
		/*ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);
		
		int max=0;
		Mobile q=m1;
		for(Mobile x:mobiles) {
			if(x.getPrice()>max) {
				max=x.getPrice();
				q=x;
			}
		}
		System.out.println(q);
		mobiles.forEach(x->{if(x.getIsAndroid()==true) {
			System.out.println(x);
		}
		});
		for(int i=0;i<mobiles.size();i++) {
			if(mobiles.get(i).getBrand().length()%2==0) {
				System.out.println(mobiles.get(i));
			}
		}
		mobiles.forEach(x->{if(x.getPrice()>50000) {
			System.out.println(x);
		}
			
		});*/
		
		

	}

}
