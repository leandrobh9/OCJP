package br.com.exercicios.enums;

public enum EnumColor {

	VERDE("verde"),
	AZUL("azul"),
	AMARELO("amarelo");
	
	private String str;
	
	private EnumColor(String s) {
		this.str = s;
	}
	
	public String toString() {
		return this.str;
	};
	
	public String format(String a){
		return this.str + a;
	}
}
