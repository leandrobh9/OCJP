package br.com.cert8;

import br.com.cert8.ClasseInternaNormal.Interna;

public class Teste {
	
	public static void main(String[] args) {
		
		// aceitavel com modificadores [protected, public, default] para Interna 
		ClasseInternaNormal n = new ClasseInternaNormal();
		Interna i = n.new Interna();
	}
	
}

