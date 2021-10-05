public class Main {
	public static void main(String[] args){
		
		/*
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		p1.estadoAtual();*/	
		
		Controlador controle = new ControleRemoto();
		
		controle.abrirMenu();
		controle.ligar();
		controle.abrirMenu();
				
	
	}
}
