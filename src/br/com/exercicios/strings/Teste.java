package br.com.exercicios.strings;

public class Teste {
	
	public static String makinStrings() {
			String s = "Fred";
			System.out.println(s);
			s = s + "47";
			System.out.println(s);
			s = s.substring(2, 5);
			System.out.println(s);
			s = s.toUpperCase();
			System.out.println(s);
			return s.toString();
	}
	
	void test(){
		StringBuffer s = new StringBuffer("123456789");
		//s.substring(3,6).delete(1,3).insert(1,"24");
	}
	
	public static void main(String[] args) {
		Teste.makinStrings();
	}
}
