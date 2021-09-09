package exercicio09;

public class Mario extends Personagem{
	private Yoshi yoshi;
	public Mario(String nome, int idade, float altura) {
		super(nome, idade, altura);
	}
	
	public void montarYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
		
	}
	public void imprimirTacomYosh() {
		if(this.yoshi!= null) {
			System.out.println("Mario esta montado no yoshi");
		}else {
			System.out.println("Mario não esta montado no yoshi");
		}
	}

	@Override
	public void crescer() {
		this.altura = this.altura *1.5f;
		
	}
}


