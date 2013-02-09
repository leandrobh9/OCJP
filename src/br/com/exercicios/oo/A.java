package br.com.exercicios.oo;

public class A {

	public void start(){
		System.out.println("A");
	}
	
	public void stop(){
		System.out.println("stopA");
	}
	
	protected void metodoComException() throws Exception{
		throw new Exception("Exception criada");
	}
}

class B extends A{
	@Override
	public void start() {
		System.out.println("B");
	}
	
	@Override
	protected void metodoComException() throws RuntimeException {
		throw new RuntimeException("asdf");
	}
}

class C {
	public static void main(String[] args) {
		((A)new B()).start();
		((A)new B()).stop();
		
		// RuntimeException
		//((B)new A()).start();
	}
}