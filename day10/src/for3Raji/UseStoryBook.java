package for3Raji;

public class UseStoryBook {
public static void main(String[]args) {
	StoryBook book1= new StoryBook();
	book1.title="Miracle";
	book1.genre="Science";
	book1.pages= 200;
	book1.price=500;
	StoryBook book2= new StoryBook();
	book2.title="chronicle";
	book2.genre="business";
	book2.pages= 150;
	book2.price=540;
	StoryBook book3= new StoryBook();
	book3.title="long way home";
	book3.genre="Story";
	book3.pages= 180;
	book3.price=450;
	StoryBook book4= new StoryBook();
	book4.title="Spiderman";
	book4.genre="fiction";
	book4.pages= 190;
	book4.price=580;
	StoryBook book5= new StoryBook();
	book5.title="SuperWoman";
	book5.genre="Science";
	book5.pages= 120;
	book5.price=600;
	StoryBook [] books= {book1,book2,book3,book4,book5};
	for(int i=0;i<books.length;i++) {
		if(books[i].price>500) {
			System.out.println(books[i].title+" "+books[i].genre+" "+books[i].pages+" "+books[i].price);
		}
	}
	for(StoryBook b : books) {
		if(b.price<500) {
			System.out.println(b.title+" "+b.genre+" "+b.pages+" "+b.price);
			
		}
	}
	
	
}
}
