package br.com.cert8;

/**
 * (1) Ap�s new Classe(), coloca-se entre duas chaves a substitui��o (overriding) de um m�todo.
 * Funciona como uma subclasse da Classe declarada. Necess�rio lembrar do ponto-e-v�rgula sempre ap�s a chave de fechamento.
 * 
 * (2) Um par�metro de um m�todo � uma Interface. No momento de passar esse par�metro � feito um "new Interface() { implementacoes de metodos aqui } " 
 * 
 * @author Leandro
 *
 */
public class ClasseAnonima {

	OutraClasse oc = new OutraClasse();
	
	OutraClasse oc2 = new OutraClasse(){
		void teste(){
			System.out.println("Mostra mensagem diferenciada.");
		}
	};
	
	public static void main(String[] args) {
		// teste (1)
		/* 
		ClasseAnonima ca = new ClasseAnonima();
		ca.oc.teste();
		ca.oc2.teste();
		*/
		
		// teste (2)
		TesteParte2 t = new TesteParte2();
		t.teste(new InterfaceTesteAnonima() {
			
			public void testeImplInterf() {
				System.out.println("teste parte 2");
			}
		});		
		
	}
}

class OutraClasse {
	void teste(){
		System.out.println("Mostra mensagem padr�o.");
	}
}

class TesteParte2{
	void teste(InterfaceTesteAnonima i){}
}

interface InterfaceTesteAnonima{
	void testeImplInterf();
}