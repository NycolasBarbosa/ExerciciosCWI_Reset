package mario;

public class Mario {
	public String nome;
	public String profissao;
	protected String missao;
	private boolean cogumelo;
	
	public void comerCogumelo(){
		cogumelo = true;
	}
	
	public void poderes() {
		if(cogumelo == true) {
			System.out.println("poder: Super força, Super Velocidade, Soltar fogo");
		}else {
			System.out.println("Sem poderes");
		}
		
	}
	
	protected void imprimir() {
		System.out.println("Nome: " +nome);
		System.out.println("Profissão: "+profissao);
		System.out.println("Missão: " + missao);
		poderes();
	}
}
