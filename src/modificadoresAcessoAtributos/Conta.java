package modificadoresAcessoAtributos;

public class Conta {
	String titular;
	int numero;
	private double saldo;
    private double limite; // adicionando um limite a conta
    private static int totalDeContas;
    
    Conta(){
    	Conta.totalDeContas = Conta.totalDeContas +1;
    }
    
    // construtor
    Conta (String titular) {
    //   faz mais uma série de inicializações e configurações
    	Conta.totalDeContas = Conta.totalDeContas +1;
        this.titular = titular;
    }

    Conta (int numero, String titular) {
        this(titular); // chama o construtor que foi declarado acima
        this.numero = numero;
    }
    
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

	public void saca(double valor) {
        //posso sacar até saldo
        if (valor > this.saldo){ 
            System.out.println("Não posso sacar um valor maior do que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }
	
	public double getSaldo() {
        return this.saldo + this.limite;
    }

	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	/*boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (!retirou) {
			//impossivel transferir
			return false;
		}else {
			//sera atribuida uma nova referencia ao objeto destino que
			//e a conta que via receber o dinheiro
			destino.saldo = destino.saldo +valor;
			return true;
		}*/
	
   public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

	
	
}
