package for2;

public class UseMarker {

	public static void main(String[] args) {
		Marker marker1=new Marker();
		Marker marker2=new Marker();
		Marker marker3=new Marker();
		Marker marker4=new Marker();
		
		String []a=args[0].split(",");
		String []b=args[1].split(",");
		String []c=args[2].split(",");
		String []d=args[3].split(",");
		
		marker1.brand=a[0];
		marker1.price=Integer.parseInt(a[1]);
		marker1.color=a[2];
		marker1.isRefillable=Boolean.parseBoolean(a[3]);
		marker1.discount=Integer.parseInt(a[4]);
		marker1.netPrice=marker1.price-marker1.discount;
		
		marker2.brand=b[0];
		marker2.price=Integer.parseInt(b[1]);
		marker2.color=b[2];
		marker2.isRefillable=Boolean.parseBoolean(b[3]);
		marker2.discount=Integer.parseInt(b[4]);
		marker2.netPrice=marker2.price-marker2.discount;
		
		marker3.brand=c[0];
		marker3.price=Integer.parseInt(c[1]);
		marker3.color=c[2];
		marker3.isRefillable=Boolean.parseBoolean(c[3]);
		marker3.discount=Integer.parseInt(c[4]);
		marker3.netPrice=marker3.price-marker3.discount;
		
		marker4.brand=d[0];
		marker4.price=Integer.parseInt(d[1]);
		marker4.color=d[2];
		marker4.isRefillable=Boolean.parseBoolean(d[3]);
		marker4.discount=Integer.parseInt(d[4]);
		marker4.netPrice=marker4.price-marker4.discount;
		
		Marker []markers= {marker1,marker2,marker3,marker4};
		
		int min=markers[0].netPrice;
		Marker temp=markers[0];
		for(Marker x:markers) {
			if(min>x.netPrice) {
				min=x.netPrice;
				temp=x;
			}
		}
		System.out.println("BRAND="+temp.brand+", NETPRICE="+temp.netPrice+", COLOR="+temp.color+", ISREFILLABLE="+temp.isRefillable);

	}

}
