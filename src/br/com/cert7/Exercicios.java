package br.com.cert7;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exercicios {

	void ex11(){
		int x = 0;
		x = 7/6;
		System.out.println(x);
	}
	
	void ex12(){
		TreeSet<String> t = new TreeSet<String>();
		t.add("a"); t.add("b"); t.add("c"); t.add("d"); t.add("e");
		
		NavigableSet<String> sub = t.subSet("b", true, "d", true);
		
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		new Exercicios().ex12(); 
	}
}
