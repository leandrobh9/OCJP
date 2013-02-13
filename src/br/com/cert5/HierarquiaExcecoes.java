package br.com.cert5;

public class HierarquiaExcecoes {

	String s;
	

	/**
	 * 		 HIERARQUIA DE EXCEÇÕES
	 *  
	 * 
	 *                Object
	 *              	|
	 *                  |
	 *              Throwable
	 *            /           \
	 *          /               \
	 *      Error              Exception
	 *      /                    /       \
	 *    /                    /           \
	 *  ...          RuntimeException        ...
	 * 
	 * - Todas as classes Exceptions s�o derivadas de java.lang.Exception
	 * - Erros nao sao excecoes e nao derivam da classe Exception
	 * - Exception, Error, Throwable e RuntimeException podem ser lancados com throw
	 * 
	 */
	static void hierarquiaException(){
		try {
			go();
		}
		catch (ExceptionB e){
			e.printStackTrace();
		}
		catch (ExceptionA e){
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	static void go() throws Exception{
		throw new ExceptionA();
	}
	
	
	/*void testeOverridingExcecao() throws ExceptionA{
		
	}*/
	void testeOverridingExcecao(){
		
	}
}

class SubHierarquiaExcecoes extends HierarquiaExcecoes{
	
	/*
	 * Pode declarar uma Exception mais especifica
	 * (non-Javadoc)
	 * @see br.com.cert5.HierarquiaExcecoes#testeOverridingExcecao()
	 */
	/*void testeOverridingExcecao() throws ExceptionB{

	}*/
	
	/*
	 * Pode nao declarar a Exception
	 * (non-Javadoc)
	 * @see br.com.cert5.HierarquiaExcecoes#testeOverridingExcecao()
	 */
	/*void testeOverridingExcecao(){

	}*/
	
	/*
	 * Nao pode declarar Exception mais generica
	 * (non-Javadoc)
	 * @see br.com.cert5.HierarquiaExcecoes#testeOverridingExcecao()
	 */
	/*void testeOverridingExcecao() throws Exception{
		
	}*/
	
	/*void testaOverriding(){
		HierarquiaExcecoes h = new SubHierarquiaExcecoes();
		try {
			h.testeOverridingExcecao();
		} catch (ExceptionA e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	/*
	 * O unico que pode ser adicionado no metodo de overriding sao os do
	 * tipo RuntimeException. Ex.: IllegalArgumentException, NumberFormatException,
	 * RuntimeException
	 * (non-Javadoc)
	 * @see br.com.cert5.HierarquiaExcecoes#testeOverridingExcecao()
	 */
	void testeOverridingExcecao() throws RuntimeException{
		// invalido
		// void testeOverridingExcecao() throws Exception{
	}

	static class X1{
		void process() throws Exception { throw new Exception(); }
	}
	static class Z1 extends X1{
		void process() { System.out.println("B"); }
	}
	
	public static void main(String[] args) throws Exception {
//		X1 x = new Z1();
//		x.process();
		
		new SubHierarquiaExcecoes().chamadaMetodoSemException();
	}
	
	public void chamadaMetodoSemException(){
		try {
			new SubHierarquiaExcecoes().metodoSemException();
		} catch (NullPointerException e){
			System.out.println("entrou");
			System.err.println(e);
		}
	}
	
	public void metodoSemException(){
		// ira estourar NullPointerException
		Integer i = null;
		int a = i;
		System.out.println("teste1");
	}
}

class ExceptionA extends Exception {
	ExceptionA(){}
}

class ExceptionB extends ExceptionA{

}
