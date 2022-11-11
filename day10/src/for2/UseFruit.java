package for2;

public class UseFruit {

	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		Fruit fruit2=new Fruit();
		Fruit fruit3=new Fruit();
		Fruit fruit4=new Fruit();
		Fruit fruit5=new Fruit();
		Fruit fruit6=new Fruit();
		
		fruit1.name="apple";
		fruit1.price=180;
		fruit1.isHybrid=true;
		
		fruit2.name="pineapple";
		fruit2.price=80;
		fruit2.isHybrid=true;
		
		fruit3.name="custardapple";
		fruit3.price=100;
		fruit3.isHybrid=true;
		
		fruit4.name="ootyapple";
		fruit4.price=140;
		fruit4.isHybrid=true;
		
		fruit5.name="grapes";
		fruit5.price=60;
		fruit5.isHybrid=true;
		
		fruit6.name="watermelon";
		fruit6.price=50;
		fruit6.isHybrid=true;
		
		Fruit []fruits= {fruit1,fruit2,fruit3,fruit4,fruit5,fruit6};
		
		/*for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
		/*for(int i=fruits.length-1;i>=0;i--) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);
	
		}*/
		/*for(int i=0;i<fruits.length/2;i++) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);

		}*/
		/*for(int i=fruits.length/2-1;i>=0;i--) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);
	
		}*/
		/*for(int i=fruits.length/2-1;i>=0;i--) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);

		}*/
		/*for(int i=fruits.length/2;i<fruits.length;i++) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);

		}*/
		for(int i=fruits.length-1;i>=fruits.length/2;i--) {
			System.out.println(fruits[i].name+" "+fruits[i].price+" "+fruits[i].isHybrid);

		}
		// TODO Auto-generated method stub

	}

}

class Fruit {
	String name;
	int price;
	boolean isHybrid;
}
