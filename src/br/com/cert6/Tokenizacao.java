package br.com.cert6;

public class Tokenizacao {

	void teste(){
		String s = "Leandro Alves de Souza";
		String[] res = s.split("\\s");
		for (String a : res){
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		new Tokenizacao().teste();
	}
}
