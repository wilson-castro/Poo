package basico;

public class TestaDuasContas {
	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.saldo= 1000;
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 1500000;
		
		meuSonho.transferePara(minhaConta, 2000);
		System.out.println("Saldo novo : "+meuSonho.saldo);
	}
}
