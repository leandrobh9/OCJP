package br.com.exercicios.exceptions;

public class Teste {

//	se nao houver catch, eh como se nao houvesse o try
//	portanto se tirar o "throws Exception" da erro de compilacao
	void metodo() throws Exception{
		try {
			throw new Exception("exceptionxxx");
		}
		finally{
			System.out.println("dentroFinally");
		}
	}
	
	public void testaMetodo() {
		try {
			metodo();
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("finallyTodo");
		}
	}
	
	public void testaRuntimeException(){
		try {
			System.out.println("teste1");
			throw new NullPointerException();
		}
		catch (RuntimeException r){
			System.out.println(r);
		}
		
		System.out.println("final");
	}
	
	public static void main(String[] args) {
		new Teste().testaRuntimeException();
	}
}
