package basico;

public class TestaReferencias {

	public static void main(String[] args) {
		
		//variaveis nunca são objetos, apenas referencias a objetos
		Conta c1;
		c1 = new Conta();
		
		Conta c2;
		c2 = new Conta();
		
		Conta c3;
		//pasando a referencia ao mesmo objeto
		c3=c1;
		
		c1.deposita(100);
		c2.deposita(500);
		c3.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		System.out.println(c3.saldo);
		/* true pois são referencias diferente mas ao mesmo objeto
		carregam o mesmo valor! */
		System.out.println(c1==c3);
		
		System.out.println("=-=-=-=-=-=-=-=-=");
		
		
		//referencias diferentes
		Conta conta1 = new Conta();
		conta1.titular = "Duke";
		conta1.saldo = 227;
		
		Conta conta2 = new Conta();
		conta2.titular = "Duke";
		conta2.saldo = 227;
		
		if (conta1==conta2) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Diferentes");
		}
	}

}
