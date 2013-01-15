package br.com.cert6;

public class Filho {

	private int A;
	private int B;
	private String nome;
	
	public Filho() {
	}
	
	Filho(int B, String nome){
		this.B = B;
		this.nome = nome;
	}
	
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
