package opps1;

public class UseTelevision {

	public static void main(String[] args) {
		Television t=new Television();
		Remote r=new Remote();
		
		r.brand="lg";
		r.price=1000;
		
		t.brand="samsung";
		t.color="ash";
		t.price=40000;
		t.remote=r;
		
		System.out.println(t.remote.brand+" "+t.remote.price+" "+t.brand);
		
		// TODO Auto-generated method stub

	}

}
