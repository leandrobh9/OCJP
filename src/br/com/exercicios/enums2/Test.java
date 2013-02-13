package br.com.exercicios.enums2;

public class Test {

	public enum Dogs{collie, harrier, shepherd};
	
	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		
		switch (myDog) {
		case collie:
			System.out.println("collie");
			;
		default:
			System.out.println("retriever");
		
		}
	}
}
