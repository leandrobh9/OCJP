package br.com.cert3;

public class Enums {

	
	public static void main(String[] args) {
		Teste t = Teste.A;
		// pontos eh visivel porque enum esta declarado dentro da classe
		// se fosse declarado fora da classe, nao seria visivel
		System.out.println(t.pontos);
	}
	
	public enum Teste{
		A(1), B(2), C(3);
		
		private int pontos;
		
		Teste(int v){
			this.pontos = v;
		}
	}
}

