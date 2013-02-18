package br.com.cert6;

public class PrintsFormatados {

	public static void main(String[] args) {
		
		int integer = 2903;
		int integerNeg = -3423;
		boolean bool = false;
		float flutuante = 3.453f;
		float flutuanteNeg = -90.8940f;
		
		System.out.printf(">%1$+(07d< \n", integer);
		System.out.printf(">%-8d<", integerNeg, bool); // nao tem 1$, pega o primeiro
//		System.out.printf("", );
//		System.out.printf("", );
//		System.out.printf("", );
		
	}
}

// Leo?