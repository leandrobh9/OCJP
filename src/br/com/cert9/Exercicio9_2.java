package br.com.cert9;

/*
 * Exercicio pag 415
 */
public class Exercicio9_2 extends Thread{

	private StringBuffer sb;
	
	public Exercicio9_2(StringBuffer sb) {
		this.sb = sb;
	}
	
	@Override
	public void run() {
		// verificar que o synchronized deve ter como par�metro o objeto 
		// que realmente � sicronizado. Exemplo de erro neste caso:
		// synchronized (this)
		synchronized (sb) {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 500; i++) {
				System.out.print(this.sb.charAt(0));
			}
			System.out.println("");
			for (int i = 0; i < 500; i++) {
				System.out.print(this.sb.charAt(1));
			}
			System.out.println("");
			for (int i = 0; i < 500; i++) {
				System.out.print(this.sb.charAt(2));
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("abc");
		Thread t = new Exercicio9_2(s1);
		Thread t2 = new Exercicio9_2(s1);
		Thread t3 = new Exercicio9_2(s1);
		t.start();
		t2.start();
		t3.start();
	}
}
