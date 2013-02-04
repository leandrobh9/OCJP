package br.com.cert9;

/**
 * Utiliza��o de synchronized 
 * Se n�o houver este marcador, o m�todo permite 2 threads executem uma parte do c�digo
 * cr�tica que � a verifica��o se h� saldo suficiente na conta para efetuar o saque
 * @param valor
 */
public class OperacoesConta implements Runnable{

	private ContaBancaria conta = new ContaBancaria();
	
	public static void main(String[] args) {
		OperacoesConta op = new OperacoesConta();
		Thread one = new Thread(op);
		Thread two = new Thread(op);
		one.setName("Leandro");
		two.setName("Janaina");
		one.start();
		two.start();
	}
	
	@Override
	public void run() {
		for (int x = 0; x < 20; x++){
			operacaoSaque(10);
			if (conta.getSaldo() < 0){
				System.out.println("Conta est� com saldo insuficiente (overdrawn).");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Exemplo de utilizacao de synchronized em m�todo
	 * Se n�o houver este marcador, o m�todo permite que 2 threads executem uma parte do c�digo
	 * execute uma parte cr�tica do c�digo que � a verifica��o se h� saldo suficiente na conta
	 * @param valor
	 */
	private synchronized void operacaoSaque(int valor){
		if (conta.getSaldo() >= valor){
			System.out.println(Thread.currentThread().getName() + " esta indo sacar...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) { 
				System.err.println(e.getMessage());
			}
			conta.sacar(valor);
			System.out.println(Thread.currentThread().getName() + " completou o saque... \n" + "Saldo atual: " + conta.getSaldo() );
		}
		else {
			System.out.println("N�o h� saldo suficiente para " + Thread.currentThread().getName() + " sacar " + valor +". Saldo atual: " + conta.getSaldo());
		}
	}
}
