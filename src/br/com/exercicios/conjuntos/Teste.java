package br.com.exercicios.conjuntos;

public class Teste {
	
	public int a = 1;
	
	public Teste(int a){
		this.a = a;
	}
	
	public boolean equals(Teste arg0) {
		System.out.println("equals(Teste arg0)");
		return this.a == arg0.a;
	}
	
	public boolean equals(Object arg0) {
		System.out.println("equals(Object arg0)");
		return this.a == ((Teste)arg0).a;
	}

	public static void main(String[] args) {
		Teste t1 = new Teste(1);
		Teste t2 = new Teste(1);
		System.out.println(t1.equals(t2));
	}
}

