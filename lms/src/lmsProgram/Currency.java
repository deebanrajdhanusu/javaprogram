package lmsProgram;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

	public static void main(String[] args) {
		double a=25000;
		String b="indian";
		NumberFormat d=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat formatter = null;
		String c=formatter.format(a);
		System.out.println(c);
	

	}

}
