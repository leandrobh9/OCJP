package br.com.cert1;

public class TestHeranca extends Heranca {

	Heranca h = new Heranca();
	
	void teste(){
		h.a = 3;
		
		// acesso do mesmo pacote (se fosse fora do pacote, daria erro de compilação)
		h.b = 4;
		
		// acesso via heranca
		b = 5;
	}
}
