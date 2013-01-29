package br.com.cert1;

/**
 * 
 * Inicialização de var statics e de instâncias
 * Todas iniciam com valores padrões
 * @author Leandro
 * 
 * (1) Tanto variáveis static como de instâncias são inicializadas com valor default 
 *
 */
public class InicializacaoVarAndArrays {

	static int age;
	public int ab;

	public void testeInicializacaoVarStaticEInstancias() {
		
		// (1) Tanto variáveis static como de instâncias são inicializadas com valor default
		
		age = age + 1;
		System.out.println("The age is " + age);

		InicializacaoVarAndArrays i = new InicializacaoVarAndArrays();
		System.out.println(i.ab + 2);
	}
	
	public void testeInicializaArrays(){
		int a[] = new int[3];
		int []b[] = new int[4][5];
		int c[] = {2,3,4};
		int []d[][] = new int[4][5][6];
		d[3][4][5] = 4;
		
		// inicialização anônima
		// não é declarado o tamanho no new
		int[]e[] = new int[][]{ {1,2}, {56,9} };
		
		// mesmo efeito da inicialização anônima
		int[]f[] = { {1,2}, {56,9} };
		
		// compile mas gera ArrayIndexOutOfBoundsException
		d[3][4][6] = 3;
		
		// valor 56
		System.out.println(e[1][0]);
	}
	
	public static void main(String[] args) {
		new InicializacaoVarAndArrays().testeInicializacaoVarStaticEInstancias();
	}
}
