package br.com.cert8;

/**
 * 
 * (1) Classes estáticas aninhada não tem um relacionamento com a classe externa
 * (2) O modificador static não informa que a classe é estática. Não existe classe estática.
 * Na verdade o modificador só indica que a classe é um membro de acesso estático.
 * (3) A declaração é feita de:
 * 		"ClasseExterna.ClasseInterna c = new ClasseExterna.ClasseInterna();" no escopo fora da classe externa
 * 		"ClasseInterna c = new ClasseInterna();" no escopo de dentro da classe externa
 * 
 * @author Leandro
 *
 */
public class ClasseEstatica {

	public int a;
	
	// (1) Classes estáticas aninhada não tem um relacionamento com a classe externa
	// (2) [...] o modificador só indica que a classe é um membro de acesso estático.
	static class AninhadaEstatica{
		void teste(){
			System.out.println("println Aninhada Estatica");
			
			// não compila, pois não é classe interna "normal"
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
