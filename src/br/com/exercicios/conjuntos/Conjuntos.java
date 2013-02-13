package br.com.exercicios.conjuntos;

import java.util.ArrayList;
import java.util.List;

public class Conjuntos {
	
	public int a = 1;
	
	public Conjuntos(int a){
		this.a = a;
	}
	
	public boolean equals(Conjuntos arg0) {
		System.out.println("equals(Teste arg0)");
		return this.a == arg0.a;
	}
	
	public boolean equals(Object arg0) {
		System.out.println("equals(Object arg0)");
		return this.a == ((Conjuntos)arg0).a;
	}

	public static void main(String[] args) {
		Conjuntos t1 = new Conjuntos(1);
		Conjuntos t2 = new Conjuntos(1);
		System.out.println(t1.equals(t2));
	}
	
	public void teste(){
		List<Integer> l = new ArrayList<Integer>();
		
//		invalido
//		for (Integer x : l.iterator()){}
	}
}

