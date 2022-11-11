package for3Raji;

public class UseAirConditioner {
	public static void main(String[]args) {
		AirConditioner con1= new AirConditioner();
		con1.brand= "Croma";
		con1.color= "White";
		con1.price= 30000;
		con1.isWarranty= true;
		AirConditioner con2= new AirConditioner();
		con2.brand= "life good";
		con2.color= "grey";
		con2.price=29000;
		con2.isWarranty= true;
		AirConditioner con3= new AirConditioner();
		con3.brand= "Havells";
		con3.color= "Black";
		con3.price= 32000;
		con3.isWarranty= false;
		AirConditioner con4= new AirConditioner();
		con4.brand= "Croma2";
		con4.color= "White";
		con4.price= 35000;
		con4.isWarranty= true;
		AirConditioner con5= new AirConditioner();
		con5.brand= "lloyd";
		con5.color= "black";
		con5.price= 27000;
		con5.isWarranty= false;
		AirConditioner con6= new AirConditioner();
		con6.brand= "voltas";
		con6.color= "grey";
		con6.price= 25000;
		con6.isWarranty= true;
		AirConditioner []air = {con1,con2,con3,con4,con5,con6};
			String max = air[0].brand;
			int index = 0;
		for(int i=0;i<air.length;i++) {
			if(air[i].brand.length()>=max.length()) {
				max = air[i].brand;
				index =i;
			}
			
		}
		System.out.println(air[index].brand+" "+air[index].price+" "+air[index].color+" "+air[index].isWarranty);
		

 String mini = air[0].brand;
 AirConditioner b = air[0];
 for(int i=0;i<air.length;i++) {
	 if(air[i].brand.length()<=mini.length()) {
		 mini=air[i].brand;
		 b= air[i];
	 }
 }
 System.out.println(b.brand+" "+b.price+" "+b.color+" "+b.isWarranty);
 AirConditioner max = air[0];
 
 for(AirConditioner x: air) {
	 if(x.price>=max.price) {
		 max = x;
	 }
	
	 
 }
 System.out.println(max.brand+" "+max.price+" "+max.color+" "+max.isWarranty);
	 }
		 
	 
 }


