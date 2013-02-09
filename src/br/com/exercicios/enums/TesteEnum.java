package br.com.exercicios.enums;

public class TesteEnum {

	String go(){
		EnumColor c = EnumColor.VERDE;
		String saida = c.format(" marinho");
		return saida;
	}
	
	public static void main(String[] args) {
		System.out.println(new TesteEnum().go());
	}
}
