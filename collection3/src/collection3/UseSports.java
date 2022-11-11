package collection3;
import java.util.*;
public class UseSports {

	public static void main(String[] args) {
		Sport s1=new Sport("chess",3,0,"red",true);
		Sport s2=new Sport("carrom",2,1,"blue",true);
		Sport s3=new Sport("football",9,5,"white,red",false);
		Sport s4=new Sport("volleyball",7,3,"black",false);
		Sport s5=new Sport("hackey",11,5,"green",false);
		Sport s6=new Sport("batminton",2,1,"orange",true);
		
		ArrayList<Sport>sports=new ArrayList<>();
		sports.add(s1);
		sports.add(s2);
		sports.add(s3);
		sports.add(s4);
		sports.add(s5);
		sports.add(s6);
		
		sports.stream().filter(x->x.getIsIndoor()==true).forEach(x->System.out.println(x));

	}

}
