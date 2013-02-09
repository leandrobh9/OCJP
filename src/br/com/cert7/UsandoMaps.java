package br.com.cert7;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * detalhe para implementação de hashCode: 
 * se um atributo é utilizado para cálculo e o mesmo é alterado em um objeto,
 * e o mesmo é alterado posterior à adição de um elemento em um map,
 * ao utilizar m.get(objeto_indice), ele não retornará o elemento desejado
 * Verificar exemplo abaixo.
 * 
 * @author Leandro
 *
 */
public class UsandoMaps {

	void testeMaps2(){
		
		// não é aceito primitivo e maps (mesmo que para o valor e não chave)
		// Map<Integer, int> m = new HashMap<Integer, int>();
	}
	
	void testaMaps(){
		Map<Indice, Cachorro> m = new HashMap<Indice, Cachorro>();
		
		Indice i1 = new Indice(1);
		Indice i2 = new Indice(2);
		
		Cachorro c1 = new Cachorro("bob");
		Cachorro c2 = new Cachorro("bruce");
		
		m.put(i1, c1);
		m.put(i2, c2);
		
		System.out.println(m.get(i1) + " " + m.get(i2));
		
		i2.setNumero(5);
		System.out.println(m.get(i1) + " " + m.get(i2));
		
	}
	
	public static void main(String[] args) {
		new UsandoMaps().testaMaps();
	}
}
// ...
class Indice{
	private int numero;

	Indice(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// ...
	@Override
	public int hashCode() {
		return numero;
	}
}

class Cachorro{
	
	private String nome;

	// constructors
	public Cachorro() {}
	public Cachorro(String nome) {
		this.nome = nome;
	}
	
	// gets and sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}

interface Pai<E>{}
interface Qualquer<E> extends Pai<E> { void teste(E x); }
