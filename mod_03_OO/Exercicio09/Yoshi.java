package exercicio09;

public class Yoshi extends Personagem{
	private int fruta;
	private int velocidade;
	
	
	public Yoshi(String nome, int idade, float altura) {
		super(nome, idade, altura);
		this.fruta = 0;
		this.velocidade = 10;
	}


	public void comerFruta() {
		fruta++;
		if(this.fruta%2 == 0){
			this.velocidade *=2;
		}
	}
	public int getVelovidade() {
		return velocidade;
	}
}
