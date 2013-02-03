package br.com.cert7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsandoSets {

	public void testeSet(){

		// retorna false ao adicionar elementos existentes
		Set<Integer> hs = new HashSet<Integer>();
		boolean b[] = new boolean[3];
		b[0] = hs.add(2);
		b[1] = hs.add(3);
		b[2] = hs.add(2);
		
		for (boolean f : b){
			System.out.println(f);
		}
	}
	
	public void testeTreeSet(){
		// pode instanciar "tipado"
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// ou sem "tipar"
		TreeSet ts2 = new TreeSet();
		
		// não compila - não aceita tipos não "comparáveis"
		ts2.add(45);
		//ts.add("Leandro");
		
		ts2.add(90);
		ts2.add(70);
		
		// "naturalmente" ordenado (visto que Integer tem compareTo implementado)
		System.out.println(ts2);
	}
	
	public static void main(String[] args) {
		new UsandoSets().testeTreeSet();
	}
}
