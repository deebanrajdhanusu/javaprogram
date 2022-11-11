package conditionIfElseStatement;

public class UseNoteBook {

	public static void main(String[] args) {
		NoteBook notebook=new NoteBook();
		notebook.brand="classmate";
		notebook.price=55;
		notebook.color="blue";
		notebook.isRulled=false;
		if(notebook.isRulled==true) {
			System.out.println(notebook.price+10);
		}
		else {
			System.out.println(notebook.price-5);
		}
		
		// TODO Auto-generated method stub

	}

}
