package br.com.exercicios.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Locale.getDefault() retorna o Locale default setado
 * Locale.setDefault(new Locale("en", "GB") seta o locale default para en GB
 * 
 * DateFormat é static e deve ser utilizado getInstance([ lingua, [pais] ])
 * DateFormat df = DateFormat.getInstance("en", "GB");
 * 
 * @author Leandro
 *
 */
public class TesteLocale {

	void go(){
		
		/*
		Locale l1 = new Locale("pt", "BR");
		Locale.setDefault(new Locale("en", "GB"));
		System.out.println(l1.getDisplayCountry());
		
		Locale l = Locale.getDefault();
		System.out.println(l.getDisplayCountry());
		*/
		
		/*for (Locale l : Locale.getAvailableLocales()){
			System.out.println(l.getLanguage() + " " + l.getCountry() + " " + l.getDisplayCountry());
		}*/
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
		DateFormat dfEnglish = DateFormat.getDateInstance(DateFormat.FULL, new Locale("en", "GB"));
		DateFormat dfEnglishUS = DateFormat.getDateInstance(DateFormat.FULL, new Locale("en", "US"));
		System.out.println(df.format(new Date()));
		System.out.println(dfEnglish.format(new Date()));
		System.out.println(dfEnglishUS.format(new Date()));
	}
	
	public static void main(String[] args) {
		new TesteLocale().go();
	}
}
