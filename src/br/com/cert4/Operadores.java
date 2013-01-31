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
	 * Ao testar todas as opções o JVM verifica que a única opção válida é a 
	 * default pois não há correspondência de valores. Após o default, até que 
	 * seja encontrado o próximo break, todas as instruções serão executadas 
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
