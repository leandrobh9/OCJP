package br.com.exercicios.enums;

public class TesteOrdinalEnum {

	enum Cor{
		VERDE,
		AZUL;
	}
	
	public static void main(String[] args) {
		Cor x = Cor.VERDE;
		Cor y = Cor.AZUL;
		
		System.out.println(x.ordinal() + " " + y.ordinal());
	}
}

