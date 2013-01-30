package br.com.cert8;
/**
 * Classes Internas de M�todo
 * (1) N�o aceita modificadores como as classes internas normais (somente abstract ou final)
 * (2) N�o acessa vars locais do metodo (somente se tiver marcador final nas vari�veis)
 * (3) Somente � vis�vel ap�s a declara��o da classe
 * 
 * @author Leandro
 *
 */
public class ClasseInternaMetodo {

	private int a = 7;
	
	void Teste(){
		
		// (1) N�o aceita modificadores como as classes internas normais (somente abstract ou final)
		final class A {
		}
		

		// (2) N�o acessa vars locais do metodo (somente se tiver marcador final nas vari�veis) 
		int x;
		class InternaMetodo{
			
			// n�o compila
			//x = 1;
			void T(){
				int b = 4;
				ClasseInternaMetodo.this.a = 8;
				a = 10;
			}
		}
		
		// (3) somente � vis�vel ap�s a declara��o da classe
		// (4) somente pode ser instanciada dentro do m�todo (o escopo � o m�todo)
		InternaMetodo im = new InternaMetodo();
	}
}

