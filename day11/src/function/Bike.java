package function;

public class Bike {
	String brand;
	int price;
	String color;
	public void findVowel(Bike[]b) {
		for(int i=0;i<b.length;i++) {
			if(b[i].brand.contains("a")||b[i].brand.contains("e")||b[i].brand.contains("i")||b[i].brand.contains("o")||b[i].brand.contains("u")) {
				System.out.println(b[i].brand+" contains vowel");
			}
			}
		}
	}

