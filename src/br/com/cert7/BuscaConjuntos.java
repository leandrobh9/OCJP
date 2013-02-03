package br.com.cert7;

import java.util.Arrays;
import java.util.Comparator;

public class BuscaConjuntos {

	public void busca(){
		
		Integer[] arr = new Integer[]{5, 3, 0, 9, 11, 17};
		
		// funciona ok
		System.out.println( Arrays.binarySearch(arr, 11) );
		
		// funciona novamente (sort � feito com comparator padr�o)
		Arrays.sort(arr);
		System.out.println( Arrays.binarySearch(arr, 11) );
		
		for (Integer i : arr) { System.out.print(i + " "); } System.out.println();
		
		Arrays.sort(arr, new ComparadorReversoInt());
		// n�o funciona pois foi feito sort com comparator espec�fico e n�o foi passado como par�metro na busca posteriormente
		System.out.println( Arrays.binarySearch(arr, 11) );
		
		// volta a funcionar
		for (Integer i : arr) { System.out.print(i + " "); } System.out.println();
		System.out.println( Arrays.binarySearch(arr, 11, new ComparadorReversoInt()) );
	}
	
	public static void main(String[] args) {
		new BuscaConjuntos().busca();
	}
	
	final class ComparadorReversoInt implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	}
}