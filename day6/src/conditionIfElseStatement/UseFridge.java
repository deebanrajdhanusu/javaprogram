package conditionIfElseStatement;

public class UseFridge {

	public static void main(String[] args) {
		Fridge fridge1=new Fridge();
		fridge1.brand="lg";
		fridge1.color="red";
		fridge1.price=12000;
		
		Fridge fridge2=new Fridge();
		fridge2.brand="samsung";
		fridge2.color="ash";
		fridge2.price=18000;
		
		Fridge fridge3=new Fridge();
		fridge3.brand="whirpool";
		fridge3.color="white";
		fridge3.price=11000;
		
		if (fridge1.price>fridge2.price&fridge1.price>fridge3.price) {
			System.out.println(fridge1.brand.toUpperCase());
		}
		else if(fridge2.price>fridge1.price&fridge2.price>fridge3.price) {
			System.out.println(fridge2.brand.toUpperCase());
			
		}
		else if(fridge3.price>fridge1.price&fridge3.price>fridge2.price) {
			System.out.println(fridge3.brand.toUpperCase()); 
		}
		// TODO Auto-generated method stub

	}

}
