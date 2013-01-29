package br.com.cert3;

public class Enums {


	public static void main(String[] args) {

		/*
		 * Primeiro Teste: acesso ao atributo
		 * "pontos" eh visivel porque enum esta declarado dentro da classe
		 * se fosse declarado fora da classe, nao seria visivel
		 */
		Teste t = Teste.A;
		System.out.println(t.pontos);

		// Segundo teste
		/*
		 * Segundo teste
		 * 
		 */
		for (Teste teste : Teste.values()){
			System.out.println(teste + " getQ: " + teste.getQ());
		}
	}

	public enum Teste{
		A(1), 
		B(2), 
		C(3){
			/*
			 * overriding (herança) do método somente para o enum C
			 * (non-Javadoc)
			 * @see br.com.cert3.Enums.Teste#getQ()
			 */
			public int getQ() { return 3; } 
		};

		private int pontos;

		Teste(int v){
			this.pontos = v;
		}

		/**
		 * Metodo generico para todos enums
		 * @return
		 */
		public int getQ(){
			return 2;
		}
	}
}
