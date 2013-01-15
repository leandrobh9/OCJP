package br.com.cert1;

/**
 * 
 * (1) O importante a notar � que strings de mesmo valor, v�o sendo alocadas
 * no mesmo objeto.
 * Ou seja, dado uma string declarada com valor "teste", novas strings 
 * com esse valor, ser�o o mesmo objeto, e ter�o == retornando iguais
 * 
 * (2) Se for dado um "new String", o retorno de == ser� diferente
 * pois ser� alocado um novo espa�o de mem�ria, mesmo sendo o mesmo valor
 * 
 * @author Leandro
 *
 */
public class Comparastrings {

	static String s1 = "I am unique!";
	
	public static void main(String[] args) {
		
		String s2 = "I am unique!";
		String s3 = new String(s1);
		
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		
		System.out.println(s1.getBytes());
		System.out.println(s2.getBytes());
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));
		
		System.out.println(TestClass.s4 == s1);
		
	}
	
}

class TestClass {
	static String s4 = "I am unique!";
}