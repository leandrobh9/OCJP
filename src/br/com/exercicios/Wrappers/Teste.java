package br.com.exercicios.Wrappers;

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
	
	public static void main(String[] args) {
		Teste.parse("a");
	}
}
