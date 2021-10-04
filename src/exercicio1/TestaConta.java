package exercicio1;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();     
	    c1.titular = "Danilo";
	    c1.saldo = 100;

	   
	    Data data = new Data();
	    c1.dataDeAbertura =data;		
		System.out.println(c1.recuperaDadosParaImpressao());
	}
}
