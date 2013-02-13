package br.com.exercicios.conjuntos;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.org.apache.xpath.internal.operations.Number;

public class Genericos<String> {

	String my;
	Genericos(String my){
		this.my = my;
	}
	
//	T[] array;
	
	// invalido
	//T[] array = new T[9];
	
	void metodoAddNoSuper(List<? super Integer> l){
		// so aceita adicionar Integer
		//l.add(new Object());
		l.add(new Integer(3));
	}
	
	void testeDeclaracoes(){
		
		// neste caso nao pode adicionar elementos
		// List<? extends Object> list = new ArrayList<Object>();
		
		List<? super Object> list = new ArrayList<Object>();
		Integer i = new Integer(3);
		list.add(i);
		
		// nao produz warning na atribuicao
		PriorityQueue<?> p1 = null;
		PriorityQueue p2 = null;
		p2 = p1;
		p1 = p2;
		
		PriorityQueue<Integer> p3 = null;
		PriorityQueue p4 = null;
		p4 = p3;
		p3 = p4;
		
	}
	void forListas(){
		// ok
		PriorityQueue<Integer> p10 = new PriorityQueue<Integer>();
		p10.offer(1); p10.offer(2); p10.offer(3);
		for (Integer i10 : p10){
			System.out.print(i10 + " ");
		}
		System.out.println();
		
		List<? super Integer> p11 = new ArrayList<Integer>();
		// invalido
		// for (Integer elem : p11){}
		// Integer i2 = p11.get(0);
		
		// valido
		for (Object elem : p11){ }
		Object i2 = p11.get(0);		
	}
	
	// invalido
//	public void metod(Set<Integer> s){}
//	public void metod(Set<Boolean> s){}
	
	public void metodo2(Integer i){ System.out.println("Integer i"); }
	public void metodo2(Integer... i){ System.out.println("Integer... i"); }
	
	void test(){
		List<? extends Integer> l = new ArrayList<Integer>();
		Integer a = l.get(0);
		
		Object c = new TreeSet<Integer>();
		
		// so aceita se for com <?> ... nao aceita <qualquer coisa diferente de ?>
		if (c instanceof NavigableSet<?>){ }
		
		Class cla = Object.class;
		Class cla2 = ArrayList.class;
		Class cla3 = new ArrayList<Integer>().getClass();
		// invalido
		// Class cla4 = new ArrayList<Integer>.class;
	}
	
	static <B> B testeMetodos(List<B> obj){
		return obj.get(0);
	}

	//public static void main(String[] args) {
		//System.out.println(new Integer((int)Float.valueOf(3.4f).floatValue()));
		//int a = (byte) 102900;
		//System.out.println(a);
//		new Genericos().testeDeclaracoes();
		
		//new Genericos().metodo2(new Integer(3), new Integer(3));
	//}
	
	String get(){
		return this.my;
	}
}

class RunTest{
	public static void main(String[] args) {
		Integer i = new Genericos<Integer>(1).get();
		System.out.println(i.getClass());
	}
}
