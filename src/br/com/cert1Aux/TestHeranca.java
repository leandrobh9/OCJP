package br.com.cert1Aux;

import br.com.cert1.Heranca;

public class TestHeranca extends Heranca {

	void teste (){
		
		// ok - acesso via heranca
		this.b = 4;
		
		// n�o acess�vel
		// protected s� � acess�vel via heran�a
		Heranca h2 = new Heranca();
		// comentado apenas para compilar
		//h2.b = 4;
	}
}
