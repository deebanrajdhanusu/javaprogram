package opps1;

public class UseShop {

	public static void main(String[] args) {
		Soap soap=new Soap("himalaya",35);
		Shampoo shampoo=new Shampoo("dove",3);
		Shop shop=new Shop("vv departmental store","kandanchavadi",soap,shampoo);
		
		System.out.println(shop.toString());
		
		// TODO Auto-generated method stub

	}

}
