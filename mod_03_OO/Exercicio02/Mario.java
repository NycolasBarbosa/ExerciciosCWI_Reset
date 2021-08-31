package mario;

public class Mario {
	String nome;
	String profissao;
	String missao;
	boolean cogumelo;
	
	void poderes() {
		if(cogumelo == true) {
			System.out.println("poder: Super força, Super Velocidade, Soltar fogo");
		}else {
			System.out.println("Sem poderes");
		}
		
	}
	
	void imprimir() {
		System.out.println("Nome: " +nome);
		System.out.println("Profissão: "+profissao);
		System.out.println("Missão: " + missao);
		poderes();
	}
}
