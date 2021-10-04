package basico;

public class Conta {
	int numero;
	Cliente titular = new Cliente();
	double saldo;
	double salario;
	
	//Metodo sem retorno
	/*void saca(double quantidade) {
		double novoSaldo= this.saldo - quantidade;
		this.saldo = novoSaldo;
		
	}*/
	
	boolean saca(double valor) {
		if (this.saldo <valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (!retirou) {
			//impossivel transferir
			return false;
		}else {
			//sera atribuida uma nova referencia ao objeto destino que
			//e a conta que via receber o dinheiro
			destino.saldo = destino.saldo +valor;
			return true;
		}
		
		
		
	}
	
	
	
}
