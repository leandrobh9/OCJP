package br.com.cert9;


/**
 * 
 * @author leandro.asouza
 *
 * Estados da Thread
 * 1. Novo: não foi chamado o start() ainda.
 * 2. Executável: já foi chamado o start(). Portanto o sheduler pode levá-lo ao estado ativo a qualquer momento
 * 3. Ativo (Executando): estado do thread em execução. Àquele que foi chamado pelo sheduler e estiver executando. 
 * 
 * Meios de "tentar" (nï¿½o hï¿½ garantias) de retirar um Thread de execuï¿½ï¿½o:
 * yield() -> solicita que o sheduler retire o thread em execuï¿½ï¿½o para colocï¿½-lo no modo executï¿½vel
 * sleep() -> solicita um tempo de sleep para o thread atual (deve ser inserido dentro de um bloco try/catch com exception do tipo InterruptedException)
 * 
 * Meio garantido
 * join() -> determina que um Thread sï¿½ pode ser executado apï¿½s a conclusï¿½o de outro 
 * Verificar o mï¿½todo abaixo testeJoin() para verificar o funcionamento
 */
public class Testthread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++){
			System.out.println("Executando a thread " + Thread.currentThread().getName() + " i = " + i);
			
			// metodo yield()
			// Nao garantias, mas o metodo yield() tenta fazer com que o Thread corrente 
			// dï¿½ lugar a outro thread
			//Thread.yield();
			
			/*
			 * dando um sleep de 1 segundo (parametro passado em milï¿½ssimos de segundos)
			 */
			/*try {
				Thread.sleep(1000 * 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
	
	public static void main(String[] args) {
		testeJoin();
	}
	

	/**
	 * ao iniciar esta execuï¿½ï¿½o, mesmo estabelecendo prioridades,
	 * nï¿½o hï¿½ garantias
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
	 * Uma vez iniciada uma thread, ela JAMAIS serï¿½ iniciada novamente
	 * Lanï¿½arï¿½ java.lang.IllegalThreadStateException mas a Thread executarï¿½ uma vez normalmente
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
		try {
			// traduï¿½ï¿½o do join() abaixo: T2, junte-se ao final de T1. Enquanto T1 nï¿½o
			// acabar, nï¿½o "volte" a executar (ou nï¿½o inicie caso nï¿½o tenha startado ainda).
			// Interessante observar que se T2.start() for feito primeiro uma parte de T2
			// poderï¿½ executar antes de iniciar T1. Quando T1 for iniciado, aï¿½ sim T2 sï¿½ 
			// voltarï¿½ a ser executado ao final de T1
			T2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		T1.start();
		T2.start();
	}
}
