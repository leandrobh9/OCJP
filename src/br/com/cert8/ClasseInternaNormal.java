package br.com.cert8;

/**
 * Classe Interna Normal (pags 372-378)
 * (1) Acesso à uma variável de instância de classe externa pode ser acessada internamente
 * (2) Instância de uma classe interna a partir de um contexto externo "visivel": new inst.new Inter(); ou new NomeClassExt().new Inter()
 * (3) Tipos de acesso this: classe externa é acessada via NomeClasseExterna.this
 * (4) Classes internas normais aceitam modificadores: final, abstract, private, public, protected (como se fosse método)
 * 
 * @author Leandro
 */
public class ClasseInternaNormal {
	
	public static void main(String[] args) {
		
		// (2) Instância de uma classe interna a partir de um contexto externo "visivel": new inst.new Inter(); ou new NomeClassExt().new Inter()
		ClasseInternaNormal c = new ClasseInternaNormal();
		Interna i = c.new Interna();
	}
	
	private int a = 1;
	
	// (4) Classes internas normais aceitam modificadores: final, abstract, private, public, protected (como se fosse método)
	protected class Interna {
		private int b = 4;
		void Teste(){
			
			// (1) Acesso à uma variável de instância de classe externa pode ser acessada internamente
			a = 3;
			
			// (3) Tipos de acesso this: this é instância da interna, externa é acessada via NomeClasseExterna.this
			this.b = 6;
			ClasseInternaNormal.this.a = 7;
			
		}
	}
}
