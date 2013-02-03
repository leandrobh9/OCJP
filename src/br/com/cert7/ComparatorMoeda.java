package br.com.cert7;

import java.util.Comparator;

public class ComparatorMoeda implements Comparator<Moeda> {

	@Override
	public int compare(Moeda o1, Moeda o2) {
		return o1.getValor().compareTo(o2.getValor());
	}
}
