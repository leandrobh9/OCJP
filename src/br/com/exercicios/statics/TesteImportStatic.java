package br.com.exercicios.statics;


// import de statics
import static br.com.exercicios.statics.ImportStatic.*;

public class TesteImportStatic {

	void teste(){
		System.out.println(
				// ok
				ImportStatic.A 
				// não compila
				//+  " " + ImportStatic.B 
				// ok
				+ " " + ImportStatic.getInt()
		);
	}
	
	public static void main(String[] args) {
		new TesteImportStatic().teste();
	}
}
