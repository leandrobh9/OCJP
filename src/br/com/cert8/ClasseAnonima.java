package br.com.cert8;

public class ClasseAnonima {

	OutraClasse oc = new OutraClasse();
	
	OutraClasse oc2 = new OutraClasse(){
		void teste(){
			System.out.println("Mostra mensagem diferenciada.");
		}
	};
	
	public static void main(String[] args) {
		ClasseAnonima ca = new ClasseAnonima();
		ca.oc.teste();
		ca.oc2.teste();
	}
}

class OutraClasse {
	void teste(){
		System.out.println("Mostra mensagem padrão.");
	}
}