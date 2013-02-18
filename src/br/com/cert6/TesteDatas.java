package br.com.cert6;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TesteDatas {

	Locale loc = getLocale();
	
	public Locale getLocale(){
		return new Locale("pt", "BR");
	}
	
	// informe a data atual por extenso e em portugues, completa e curta
	public void dataPortugues(){
		
		DateFormat formatFullPtBR = DateFormat.getDateInstance(DateFormat.FULL, loc);
		DateFormat formatShortPtBR = DateFormat.getDateInstance(DateFormat.SHORT, loc);
		
		
		Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.MONTH, 1);
		
		System.out.println(formatFullPtBR.format(cal.getTime()));
		System.out.println(formatShortPtBR.format(cal.getTime()));
		
		// lembrar desse ponto (mês é de 0 a 11)
		cal.set(2013, 11, 31);
		System.out.println(formatFullPtBR.format(cal.getTime()));
		System.out.println(formatShortPtBR.format(cal.getTime()));	
	}
	
	public void dataGermany(){
		Calendar cal = Calendar.getInstance();
		DateFormat formatShortGERMAN = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		System.out.println(formatShortGERMAN.format(cal.getTime()));
	}
	
	/*
	 * imprimir na tela, o valor formatado com locale = pt,BR
	 */
	public void dinheiroPtBr(){

		// pode ser utilizado tanto float, quanto BigDecimal, entre outros
		float valor = (float)(34.512 + 90.877);
		BigDecimal b = new BigDecimal(4.509);
		
		NumberFormat nf = NumberFormat.getInstance(this.loc);
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(this.loc);
		
		System.out.println(nf.format(b));
		System.out.println(nf2.format(b));
	}
	
	public static void main(String args[]){
		TesteDatas t = new TesteDatas();
		t.dataPortugues();
		t.dinheiroPtBr();
		t.dataGermany();
	}
}
