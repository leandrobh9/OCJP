package br.com.cert7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList: 
 * Observar m�todos indeOf(obj) e get(int)
 * 
 * LinkedList
 * Implementa interface PriorityQueue (al�m do conceito de fila, vai al�m
 * com o conceito de priority in, priority out)
 * 
 * @author Leandro
 *
 */
public class UsandoListsEQueue {

	public void usandoArrayLists(){
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(45);
		Integer i1 = new Integer(80);
		l.add(i1);
		
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()){
			Integer t = i.next();
		}
		
		// indexOf retorna a posi��o do elemento consultado na lista
		System.out.println(l.size() + " " + l.get(0) + " " + l.indexOf(i1) + " " + l.indexOf(45));
	}
	
	public void usandoLinkedLists(){
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 1; i <= 20; i++){
			// insere no final (mesmo que offerLast)
			l.offer(i);
		}
		
		//for (int i = 0; i < 20; i++){
		while (l.size() > 0){
			// retorna o �ltimo elemento
			//System.out.print(l.peekLast() + " ");
			
			System.out.println("Lista atual: " + l);
			// retorna o primeiro elemento e o retira da lista
			int elementoRemovido = l.pollLast();
			System.out.print("Elemento removido: " + elementoRemovido + ". ");
		}
		System.out.println();
		System.out.println("Lista no final: " + l);
	}
	
	public static void main(String[] args) {
		//new UsandoLists().usandoArrayLists();
		new UsandoListsEQueue().usandoLinkedLists();
		
	}
}
