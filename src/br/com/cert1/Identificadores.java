package br.com.cert1;

/**
 * Conven��es de c�digo
 */

/*
 * Classes e interfaces: iniciam com letra maiuscula
 * 		Ex.: Pessoa, CustomerController
 */
public class Identificadores {

	/*
	 * Identificadores legais come�am com
	 * - uma letra
	 * - underscore (_)
	 * - ou o cifr�o ($)
	 */
	private int a;
	private long $3aaaaaaa;
	private String ______3;

	/*
	 * Vari�veis: primeira letra min�scula. Padr�o camelCase.
	 */
	private int idadeMaior;
	
	/*
	 *  Constantes: Todas as letras mai�sculas
	 */
	public static int MAIOR_IDADE = 18;
	
	/* 
	 * M�todos: primeira letra min�scula. Padr�o camelCase.
	 */ 
	public int getA() { 
		return a; 
	}
	
	
}
