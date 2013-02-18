package br.com.exercicios.wrappers;

public class Teste {

	float go(){
		
		float my_var = 0;
		
		return my_var;
	}
	
	static void parse(String str){
		
		float f = 1f;
		
		try {
			f = Float.parseFloat(str); 
		} catch (NumberFormatException e) {
			f = 0;
		}
		finally{
			System.out.println(f);
		}
	}
	
	void testeOperacoes(){
		Integer INT = 10;
		Long LONG = 10l;
		Short SHORT = 10;
		Float FLOAT = 10.0f;
		
		int intP = 10;
		short shortP = 10;
		long longP = 10;
		float floatP = 10.0f;
		double dP = 10.0;
		
		System.out.println("Wrappers: ");
		System.out.println("INT e LONG " + INT.equals(LONG));
		System.out.println("LONG e SHORT " + LONG.equals(SHORT));
		System.out.println("INT e FLOAT " + INT.equals(FLOAT));
		System.out.println("SHORT e FLOAT " + SHORT.equals(FLOAT));
		System.out.println();
		
		System.out.println("Primitivos: ");
		System.out.println("int e long " + (intP == longP) );
		System.out.println("short e long " + (shortP == longP) );
		System.out.println("float e int " + (floatP == intP) );
		System.out.println("float e long " + (floatP == longP) );
		System.out.println();
		
		System.out.println("Wrapper e Primitivos: ");
		System.out.println("INT e long " + (INT.equals(longP)) );
		System.out.println("LONG e short " + (LONG.equals(shortP)) );
		System.out.println("SHORT e int " + (SHORT.equals(intP)) );
		System.out.println("LONG e float " + (LONG.equals(floatP)) );
		System.out.println("SHOT e float " + (SHORT.equals(floatP)) );
		System.out.println("INT e int " + (INT.equals(intP)) );
		System.out.println("SHORT e short " + (SHORT.equals(shortP)) );
		System.out.println("LONG e long " + (LONG.equals(longP)) );
		System.out.println("FLOAT e float " + (FLOAT.equals(floatP)) );
		System.out.println();
		
		System.out.println("Wrapper e Primitivos com == : ");
		System.out.println("SHORT == 10 " + (SHORT == 10) );
		System.out.println("INT == 10 " + (INT == 10) );
		System.out.println("LONG == 10 " + (LONG == 10) );
		System.out.println("FLOAT == 10.0f " + (FLOAT == 10.0f) );
		System.out.println();
		
		System.out.println("Comparativos (seguem a logica, pois fazem unboxing antes da comparação): ");
		System.out.println("SHORT < INT " + (SHORT < INT) );
		System.out.println("SHORT <= INT " + (SHORT <= INT) );
		System.out.println("INT <= LONG " + (INT <= LONG) );
		System.out.println("FLOAT < 10.0f " + (FLOAT < 10.0f) );
		
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Teste.parse("a");
		new Teste().testeOperacoes();
	}
}
