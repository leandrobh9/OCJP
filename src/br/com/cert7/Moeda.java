package br.com.cert7;

/**
 * Classe que exemplifica a utiliza��o de Comparable e Comparator
 * Verificar o uso em OrdenaMoedaViaComparable e OrdenaViaComparator
 * 
 * Quando h� o acesso � classe pode ser implementado a <<I>> Comparable (subscrever o m�todo) 
 * Caso contr�rio, deve-se implementar a <<I>> Comparator (m�todo compare)
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
