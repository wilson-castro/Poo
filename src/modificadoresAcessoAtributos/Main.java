package modificadoresAcessoAtributos;

public class Main {

	public static void main(String[] args) {
		String carlos = "Carlos";
		Conta c = new Conta(carlos);
		System.out.println(c.titular);
		System.out.println("Total de contas: "+Conta.getTotalDeContas());
	}

}
