package objeact;

public class UseStationary {
	public static void main(String[]args) {
		Stationnary product=new Stationnary();
		product.pen=true;
		product.inkpen=true;
		product.rubber=true;
		product.scale=true;
		product.pencil=true;
		product.sharpner=true;
		product.note=true;
		product.penPrice=10;
		product.inkpenPrice=50;
		product.rubberPrice=5;
		product.scalePrice=5;
		product.PencilPrice=5;
		product.sharpenerPrice=10;
		product.notePrice=55;
		
		
		Stationnary product1=new Stationnary();
		product1.pen=true;
		product1.inkpen=true;
		product1.rubber=true;
		product1.scale=true;
		product1.pencil=true;
		product1.sharpner=true;
		product1.note=true;
		product1.penPrice=20;
		product1.inkpenPrice=100;
		product1.rubberPrice=10;
		product1.scalePrice=8;
		product1.PencilPrice=12;
		product1.sharpenerPrice=11;
		product1.notePrice=105;
		Stationnary product2=new Stationnary();
		product2.pen=true;
		product2.inkpen=true;
		product2.rubber=true;
		product2.scale=true;
		product2.pencil=true;
		product2.sharpner=true;
		product2.note=true;
		product.penPrice=50;
		product2.inkpenPrice=2000;
		product2.rubberPrice=15;
		product2.scalePrice=15;
		product2.PencilPrice=20;
		product2.sharpenerPrice=20;
		product2.notePrice=150;
		product.totalPrice=product1.penPrice+product1.inkpenPrice+product1.notePrice+product1.rubberPrice+product1.scalePrice+product1.sharpenerPrice;
		System.out.println(product.totalPrice);
		product.averagePrice=(product.totalPrice)/7;
		product1.totalPrice=product.penPrice+product.inkpenPrice+product.notePrice+product.rubberPrice+product.scalePrice+product.sharpenerPrice;
		System.out.println(product1.totalPrice);
		product1.averagePrice=product1.totalPrice/7;
		product2.totalPrice=product2.penPrice+product1.inkpenPrice+product1.notePrice+product1.rubberPrice+product1.scalePrice+product1.sharpenerPrice;
		System.out.println(product2.totalPrice);
		product2.averagePrice=product2.totalPrice/7;
		System.out.println(product.pen+" "+product.inkpen+" "+product.rubber+" "+product.scale+" "+product.pencil+" "+product.sharpner+" "+product.note);
		int totalPrice=product1.totalPrice+product.totalPrice+product2.totalPrice;
		System.out.println(totalPrice);
		System.out.println(product.averagePrice);
		System.out.println(product1.averagePrice);
		System.out.println(product2.averagePrice);
		
	}

}
