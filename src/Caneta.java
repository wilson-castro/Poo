
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta "+this.cor);
		System.out.println("Está tampada ? "+this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada ==true) {
			System.out.println("ERRO, caneta tampada");
		}else {
			System.out.println("Estou rabiscando...");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
}
