package basico;

public class Programa {

	public static void main(String[] args) {
		//criando conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		//alterando os valores de minhaConta
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000;
		
		//sacar com validação do valor utilizando metodo com retorno
		boolean consegui = minhaConta.saca(2000);
		if (consegui) {
			System.out.println("Consegui sacar");
		}else {
			System.out.println("Não consegui sacar");
		}
		
		//deposita 500 reais
		minhaConta.deposita(500);
		
		System.out.println("Saldo atual : "+minhaConta.saldo);
		
		
		
	}

}
