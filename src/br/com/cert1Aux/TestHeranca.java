package br.com.cert1Aux;

import br.com.cert1.Heranca;

public class TestHeranca extends Heranca {

	void teste (){
		
		// ok - acesso via heranca
		this.b = 4;
		
		// não acessível
		// protected só é acessível via herança
		Heranca h2 = new Heranca();
		// comentado apenas para compilar
		//h2.b = 4;
	}
}
