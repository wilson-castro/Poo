
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	ContaBanco(){
		this.saldo=0;
		this.status = false;
	}
	
	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta "+this.getNumConta());
		System.out.println("Tipo "+this.getTipo());
		System.out.println("Dono "+this.getDono());
		System.out.println("Saldo "+this.getSaldo());
		System.out.println("Status "+this.status);
		System.out.println();

	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo(50);
		} else if("CP".equals(t)){
			this.setSaldo(150);
		}
		System.out.println("Conta aberta");
	}
	
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("Não pode ser fechada porque tem dinheiro.");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada porque tem debido");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada");
		}
	}
	
	public void depositar(float valor) {
		if(this.isStatus()) {
			this.setSaldo(valor+this.getSaldo()); 
			System.out.println("Deposito realizado. Dono :"+this.getDono());
		}
	}
	
	public void sacar(float valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo()-valor);
				System.out.println("Saque realidade na conta de "+this.getDono());
				
			}else {
				System.out.println("Saldo insuficiente pra sacar");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
	public void pagarMensalidade() {
		int v =0;
		
		if ("CC".equals(this.getTipo())) {
			v=12;
		}else if("CP".equals(getTipo())){
			v=20;
		}
		
		if(this.isStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso"+this.getDono());
		}else {
			System.out.println("Impossível pagar um conta fechada");
		}
		
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	private void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean isStatus() {
		return this.status;
	}
}
