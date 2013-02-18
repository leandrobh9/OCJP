package br.com.cert1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ClassB extends ClasseA {
	
	void teste(){
		
		Integer[] array1 = {28,49,64,55,23,24,59,68,34,67,22,59,12,33,5,47,44,
				62,30,74,8,23,28,5,15,58,44,29,43,32,4,25,18,71,35,27,47,35,
				39,72,38,20,34,68,74,52,59,29,56,55,70,73,50,66,31,
				3,26,48,40,16,63,10,42,36,14,51,11,65,46,37,54,41,60,2,
				7,9,6,45,17,21,19,1,53,57,75};
		
		Integer[] array = {67,};
		
		Set<Integer> s = new TreeSet<Integer>();
		for (int x : array){
			s.add(x);
		}
		int i = 1; // 13, 61, 69
		for (Integer aa : s){
			System.out.print(aa + " ");
			if (i++ % 10 == 0) 
				System.out.println();
		}
	}
	
	void teste2(){
		int x = "a".charAt(0); 
		int y = "b".charAt(0);
//		System.out.println(x + " " + y);
		
		String[] array = {"leandro", "souza", "alves"};
		
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.charAt(0) - o2.charAt(0);
			}
		};
		Arrays.sort(array, c);
		for (String s : array){
			System.out.println(s);
		}
		
	}
	
	void teste3(){
		try{
			String s = null;
			System.out.println(s.toString());
		}
		finally{
			System.out.println("teste");
		}
		System.out.println("teste67");
	}
	
	public static void main(String... qwew) {
		new ClassB().teste();
		
//		A r = A.c;
//		
//		switch(r){
//			case c: r = A.a; if (true) { System.out.println("oi"); }
//		}
//		int x = 1;
//		int y = 8;
//		final int u = 8;
//		switch(x){
//			case u: y++;
//		}
//		System.out.println(x);
//		
//		int u = 8;
//		int z = (u++ * ++u);
//		System.out.println(z);
//		System.out.println(u);
	}
}

enum A {
//	enum sem ponto e virgula pode
	a,b,c	
}
