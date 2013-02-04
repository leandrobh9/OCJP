package br.com.cert9;

/**
 * Utilização de synchronized 
 * Se não houver este marcador, o método permite 2 threads executem uma parte do código
 * crítica que é a verificação se há saldo suficiente na conta para efetuar o saque
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
				System.out.println("Conta está com saldo insuficiente (overdrawn).");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Exemplo de utilizacao de synchronized em método
	 * Se não houver este marcador, o método permite que 2 threads executem uma parte do código
	 * execute uma parte crítica do código que é a verificação se há saldo suficiente na conta
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
			System.out.println("Não há saldo suficiente para " + Thread.currentThread().getName() + " sacar " + valor +". Saldo atual: " + conta.getSaldo());
		}
	}
}
