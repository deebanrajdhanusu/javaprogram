package collection3;
import java.util.*;
import java.util.stream.Collectors;
public class Review {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(23);
		a.add(12);
		a.add(24);
		a.add(17);
		List<Integer>b=a.stream().filter(x->x%2!=0).collect(Collectors.toList());
		long c=a.stream().filter(x->x%2!=0).count();
		System.out.println(b.stream().count());
		System.out.println(c);

	}

}
