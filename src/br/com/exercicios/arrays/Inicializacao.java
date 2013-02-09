package br.com.exercicios.arrays;

public class Inicializacao {
	
	// static final int[] a = new int[2] { 100,200 };
	
	static final int[] a;

	static { a=new int[2]; a[0]=100; a[1]=200; }
	
	void go(){
		final int[] b = new int[]{12, 34};
	}
}
