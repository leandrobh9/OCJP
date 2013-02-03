package br.com.cert7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaViaComparator {

	public static void main(String[] args) {
		List<Moeda> lista = new ArrayList<Moeda>();
		Moeda m1 = new Moeda(79); 
		Moeda m2 = new Moeda(45); 
		Moeda m3 = new Moeda(56);
		lista.add(m1); 
		lista.add(m2); 
		lista.add(m3);
		
		// segundo parâmetro é um objeto da classe Comparator
		Collections.sort(lista, new ComparatorMoeda());
		System.out.println(lista);
	}
}
