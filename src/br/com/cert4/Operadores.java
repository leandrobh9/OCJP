package br.com.cert4;

public class Operadores {

	int index = 0;
	
	void prePosIncremento(){
		int[][] a = new int[][]{ {2,5}, {7,9} };
		
		System.out.println("valor: " + a[index++][index++]);
		System.out.println("index: " + index);
	}
	
	public static void main(String[] args) {
		//new Operadores().prePosIncremento();
		new Operadores().testeSwitch();
	}
	
	/*
	 * O teste abaixo informa o valor 642, visto que 1 foi passado ao switch. 
	 * Ao testar todas as op��es o JVM verifica que a �nica op��o v�lida � a 
	 * default pois n�o h� correspond�ncia de valores. Ap�s o default, at� que 
	 * seja encontrado o pr�ximo break, todas as instru��es ser�o executadas 
	 * dentro de outros cases.
	 */
	public void testeSwitch(){
		int a = 1;
		
		switch(a){
			case 2: 
				System.out.print("2"); 
				break;
			default:
				System.out.print("6");
				// nao existe break aqui
			case 4:
				System.out.print("4");
				// nao existe break aqui
			case 5:
				System.out.print("5");
				break;
		}
	}
}
