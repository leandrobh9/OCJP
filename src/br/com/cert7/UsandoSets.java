package br.com.cert7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Lembrar que 
 * - o método add(obj) retorna um boolean
 * - TreeSet não aceita adicionar elementos de hierarquias diferentes
 * - TreeSet pode usar Comparator
 * @author Leandro
 * 
 * Em testeLinkedHashSet() abaixo pode ser visto que a inserção em LinkedHashSet
 * gera uma ordem (apesar de no livro da Kathy Sierra afirmar que a ordem mesmo
 * no caso do LinkedHashSet não é garantida
 *
 */
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
	
	public void testeLinkedHashSet(){
		HashSet<Integer> h = new HashSet<Integer>();
		this.adiciona(h);
		System.out.print("HashSet:       ");
		System.out.println(h);
		
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		this.adiciona(l);
		System.out.print("LinkedHashSet: ");
		System.out.println(l);
	}
	
	public void adiciona(Set<Integer> s){
		for (int i = 1; i <= 100; i++){
			// faz o boxing automaticamente para new Integer(i)
			s.add(i);
		}
	}
	
	public static void main(String[] args) {
		new UsandoSets().testeLinkedHashSet();
	}
}
