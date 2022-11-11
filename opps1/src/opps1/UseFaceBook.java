package opps1;

public class UseFaceBook {

	public static void main(String[] args) {
		FaceBook f=new FaceBook();
		FaceBook f1=new FaceBook();
		FaceBook f2=new FaceBook();
		
		
		f.setUserName("abc");
		f.setPassWord("127$");
		
		f1.setUserName("egs");
		f1.setPassWord("2yudu8");
		
		f2.setUserName("jhefue");
		f2.setPassWord("hwedguy");
		
		FaceBook facebooks[]= {f,f1,f2};
		
		for(FaceBook x:facebooks) {
		System.out.println(x.getUserName()+" "+x.getPassWord());
		}
		// TODO Auto-generated method stub

	}

}
