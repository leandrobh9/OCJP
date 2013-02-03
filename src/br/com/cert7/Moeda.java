package br.com.cert7;

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
