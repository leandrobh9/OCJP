package br.com.cert7;

/**
 * Classe que exemplifica a utilização de Comparable e Comparator
 * Verificar o uso em OrdenaMoedaViaComparable e OrdenaViaComparator
 * 
 * Quando há o acesso à classe pode ser implementado a <<I>> Comparable (subscrever o método) 
 * Caso contrário, deve-se implementar a <<I>> Comparator (método compare)
 * 
 * @author Leandro
 *
 */
public class Moeda 
		implements Comparable<Moeda>{

	public Moeda(){}
	public Moeda(Integer v){
		this.valor = v;
	}
	
	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Moeda o) {
		return valor.compareTo(o.getValor());
	}
	
	@Override
	public String toString() {
		return this.valor + " ";
	}
}
