package br.com.cert7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaMoedaViaComparable {

	public static void main(String[] args) {
		
		List<Moeda> lista = new ArrayList<Moeda>();
		Moeda m1 = new Moeda(79); 
		Moeda m2 = new Moeda(45);
		Moeda m3 = new Moeda(56);
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		//carrega elementos
		Collections.sort(lista);
		System.out.println(lista);

	}
}
