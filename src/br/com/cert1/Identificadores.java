package br.com.cert1;

/**
 * Convenções de código
 */

/*
 * Classes e interfaces: iniciam com letra maiuscula
 * 		Ex.: Pessoa, CustomerController
 */
public class Identificadores {

	/*
	 * Identificadores legais começam com
	 * - uma letra
	 * - underscore (_)
	 * - ou o cifrão ($)
	 */
	private int a;
	private long $3aaaaaaa;
	private String ______3;

	/*
	 * Variáveis: primeira letra minúscula. Padrão camelCase.
	 */
	private int idadeMaior;
	
	/*
	 *  Constantes: Todas as letras maiúsculas
	 */
	public static int MAIOR_IDADE = 18;
	
	/* 
	 * Métodos: primeira letra minúscula. Padrão camelCase.
	 */ 
	public int getA() { 
		return a; 
	}
	
	static void testeArray(){
		int [] a = new int[3];
//		a[1000]  = 10;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
	}
	
	public static void main(String[] args) {
		testeArray();
	}
	
}
