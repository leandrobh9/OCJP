package br.com.cert7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lembrar do método indeOf(obj) e get(int)
 * @author Leandro
 *
 */
public class UsandoLists {

	public void teste(){
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(45);
		Integer i1 = new Integer(80);
		l.add(i1);
		
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()){
			Integer t = i.next();
		}
		
		// indexOf retorna a posição do elemento consultado na lista
		System.out.println(l.size() + " " + l.get(0) + " " + l.indexOf(i1) + " " + l.indexOf(45));
	}
	
	public static void main(String[] args) {
		new UsandoLists().teste();
	}
}
