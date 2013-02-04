package br.com.cert9;


/**
 * 
 * @author leandro.asouza
 *
 * (1) Sobre Threads
 * 
 * Estados da Thread
 * 1. Novo: não foi chamado o start() ainda.
 * 2. Executável: já foi chamado o start(). Portanto o sheduler pode levá-lo ao estado ativo a qualquer momento
 * 3. Ativo (Executando): estado do thread em execução. Àquele que foi chamado pelo sheduler e estiver executando. 
 * 
 * Meios de "tentar" (não há garantias) de retirar um Thread de execução:
 * yield() -> solicita que o sheduler retire o thread em execução para colocá-lo no modo executável
 * sleep() -> solicita um tempo de sleep para o thread atual (deve ser inserido dentro de um bloco try/catch com exception do tipo InterruptedException)
 * 
 * Meio garantido
 * join() -> determina que um Thread só pode ser executado após a conclusão de outro 
 * Verificar o método abaixo testeJoin() para verificar o funcionamento
 * 
 * (2) Sobre o código abaixo
 * 
 */
public class Testthread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++){
			System.out.println("Executando a thread " + Thread.currentThread().getName() + " i = " + i);
			
			// metodo yield()
			// O método yield() tenta fazer com que o Thread corrente dê lugar a outro thread - não há garantias
			Thread.yield();
			
			/*
			 * dando um sleep de 1 segundo (parametro passado em miléssimos de segundos)
			 */
			try {
				Thread.sleep(1000 * 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		testeJoin();
		//iniciarSomenteUmaVez();
	}
	

	/**
	 * ao iniciar esta execução, mesmo estabelecendo prioridades,
	 * não há garantias
	 */
	public static void rodandoThreads(){
		for (int i = 0; i < 10; i++){
			Testthread test = new Testthread();
			Thread t = new Thread(test);
			int priority = (i!=0) ? i : 1;
			//t.setPriority(priority);
			t.start();
		}
	}

	/**
	 * Uma vez iniciada uma thread, ela JAMAIS será iniciada novamente
	 * Lançará java.lang.IllegalThreadStateException mas a Thread executará uma vez normalmente
	 */
	public static void iniciarSomenteUmaVez(){
		Testthread test = new Testthread();
		Thread t = new Thread(test);
		t.start();
		t.start();
	}
	
	public static void testeJoin(){
		Testthread t1 = new Testthread();
		Testthread t2 = new Testthread();
		Thread T1 = new Thread(t1);
		Thread T2 = new Thread(t2);
/*		try {
			// tradução do join() abaixo: T2, junte-se ao final de T1. Enquanto T1 não
			// acabar, não "volte" a executar (ou não inicie caso não tenha startado ainda).
			// Interessante observar que se T2.start() for feito primeiro uma parte de T2
			// poderá executar antes de iniciar T1. Quando T1 for iniciado, aí sim T2 só 
			// voltará a ser executado ao final de T1
			T2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		T1.start();
		T2.start();
	}
}
