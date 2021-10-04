package exercicio1;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataDeAbertura;
	
	
	
	void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
    void deposita(double valor) {
	   this.saldo = this.saldo + valor;
   }
    
    double getRendimento() {
    	return this.saldo*0.1;
    }
    
    
    String recuperaDadosParaImpressao() {
        String dados = "\nTitular: " + this.titular;

        dados += "\nNumero: "+this.numero;
        dados += "\nAgencia: "+this.agencia;
        dados += "\nSaldo: "+this.saldo;
        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMês: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }
	
}
