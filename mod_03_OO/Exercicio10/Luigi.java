package exercicio09;

public class Luigi extends Personagem{
	public Luigi(String nome, int idade, float altura) {
		super(nome, idade, altura);
	}

	public void voar() {
		System.out.println("Luigi est� voando.");
	}

	@Override
	public void crescer() {
		this.altura = this.altura *1.75f;
		
	}
}
