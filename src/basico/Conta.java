package basico;

public class Conta {
	int numero;
	String titular;
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
	
	
}
