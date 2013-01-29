package br.com.cert8;

/**
 * 
 * (1) Classes est�ticas aninhada n�o tem um relacionamento com a classe externa
 * (2) O modificador static n�o informa que a classe � est�tica. N�o existe classe est�tica.
 * Na verdade o modificador s� indica que a classe � um membro de acesso est�tico.
 * (3) A declara��o � feita de:
 * 		"ClasseExterna.ClasseInterna c = new ClasseExterna.ClasseInterna();" no escopo fora da classe externa
 * 		"ClasseInterna c = new ClasseInterna();" no escopo de dentro da classe externa
 * 
 * @author Leandro
 *
 */
public class ClasseEstatica {

	public int a;
	
	// (1) Classes est�ticas aninhada n�o tem um relacionamento com a classe externa
	// (2) [...] o modificador s� indica que a classe � um membro de acesso est�tico.
	static class AninhadaEstatica{
		void teste(){
			System.out.println("println Aninhada Estatica");
			
			// n�o compila, pois n�o � classe interna "normal"
			// a = 3;
		}
	}
	
	void metodoQualquer(){
		AninhadaEstatica a = new AninhadaEstatica();
		a.teste();
	}
	
	public static void main(String[] args) {
		// new ClasseEstatica().metodoQualquer();
		ClasseAuxiliar ca = new ClasseAuxiliar();
		ca.metodo();
	}
}

class ClasseAuxiliar{
	void metodo(){
		ClasseEstatica.AninhadaEstatica a = new ClasseEstatica.AninhadaEstatica();
		a.teste();
	}
}
