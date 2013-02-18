package br.com.cert6;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class UsandoNumberFormat {

	int teste2(){
		int x = 1, y = 1;
		return x = y; 
	}
	
	void teste(){
		NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
		nf.setMaximumFractionDigits(2);
		String s = "12.890874";
		Double d = 12.890874;
		try {
			System.out.println(nf.parse(s));
			System.out.println(nf.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UsandoNumberFormat().teste();
	}
}
