package br.com.cert7;

import java.util.Comparator;

/**
 * Auxiliar da classe OrdenaViaComparator no mesmo pacote
 * 
 * Implementação da interface Comparator
 * Neste caso uma ordem descrescente
 * @author Leandro
 *
 */
public class ComparatorMoeda implements Comparator<Moeda> {

	@Override
	public int compare(Moeda o1, Moeda o2) {
		return o1.getValor().compareTo(o2.getValor());
	}
}
