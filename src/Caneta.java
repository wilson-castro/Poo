
public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	
	Caneta(){
		this.tampar();
		this.cor="Azul";
	}
	
	
	public void status() {
		System.out.println("Uma caneta "+this.cor);
		System.out.println("Está tampada ? "+this.tampada);
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
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
	
	
	//metodos especiais
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
}
