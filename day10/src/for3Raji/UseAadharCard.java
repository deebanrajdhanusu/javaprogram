package for3Raji;

public class UseAadharCard {
	public static void main(String[] args) {
		AadharCard aadhar1= new AadharCard();
		aadhar1.name= "Rajalakshmi";
		aadhar1.fathername="Chidambaaram";
		aadhar1.dob= "02/09/1998";
		aadhar1.number= 43217654843l;
		aadhar1.location= "cuddalore";
		AadharCard aadhar2= new AadharCard();
		aadhar2.name= "Rahul";
		aadhar2.fathername="balamurugan";
		aadhar2.dob= "05/09/2000";
		aadhar2.number= 54217698846l;
		aadhar2.location= "neyvel";
		AadharCard aadhar3= new AadharCard();
		aadhar3.name= "Kowshik";
		aadhar3.fathername="vijay";
		aadhar3.dob= "12/03/1998";
		aadhar3.number= 871765754437l;
		aadhar3.location= "cuddalore";
		AadharCard aadhar4= new AadharCard();
		aadhar4.name= "saritha";
		aadhar4.fathername="Chidam";
		aadhar4.dob= "15/09/2001";
		aadhar4.number= 32176549748l;
		aadhar4.location= "ariyalur";
		AadharCard aadhar5= new AadharCard();
		aadhar5.name= "suresh";
		aadhar5.fathername="ramalingam";
		aadhar5.dob= "12/09/1994";
		aadhar5.number= 832165654844l;
		aadhar5.location= "chennai";
		AadharCard card[] = new AadharCard[5];
		card[0]=aadhar1;
		card[1]=aadhar2;
		card[2]=aadhar3;
		card[3]=aadhar4;
		card[4]=aadhar5;
		for(int i=0;i<card.length;i++) {
			if(card[i].number%2==0) {
				System.out.println(card[i].name+" "+card[i].fathername+" "+card[i].dob+" "+card[i].number+" "+card[i].location);
			}
		}
		for(AadharCard a : card) {
			if(a.number%2!=0) {
				System.out.println(a.name+" "+a.fathername+" "+a.dob+" "+a.number+" "+a.location);
				
			}
		}
		
		
		
		
	}

}
