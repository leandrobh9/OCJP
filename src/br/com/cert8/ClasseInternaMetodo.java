package br.com.cert8;
/**
 * Classes Internas de Método
 * (1) Não aceita modificadores como as classes internas normais (somente abstract ou final)
 * (2) Não acessa vars locais do metodo (somente se tiver marcador final nas variáveis)
 * (3) Somente é visível após a declaração da classe
 * 
 * @author Leandro
 *
 */
public class ClasseInternaMetodo {

	private int a = 7;
	
	void Teste(){
		
		// (1) Não aceita modificadores como as classes internas normais (somente abstract ou final)
		final class A {
		}
		

		// (2) Não acessa vars locais do metodo (somente se tiver marcador final nas variáveis) 
		int x;
		class InternaMetodo{
			
			// não compila
			//x = 1;
			void T(){
				int b = 4;
				ClasseInternaMetodo.this.a = 8;
				a = 10;
			}
		}
		
		// (3) somente é visível após a declaração da classe
		// (4) somente pode ser instanciada dentro do método (o escopo é o método)
		InternaMetodo im = new InternaMetodo();
	}
}

