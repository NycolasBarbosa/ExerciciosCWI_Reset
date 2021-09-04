package mario;

public class Mario implements MarioInterface{
	private String nome;
	private int idade;
	private float altura;
	private int estamina;
	private int vida;
	private int moedas;
	
	public Mario(){
		this.nome = "Mario Bross";
		this.idade = 40;
		this.altura = 1.50f;
		this.estamina = 100;
		this.vida = 1;
		this.moedas=0;
	}

	public void crescer() {
		altura = altura*2;
		System.out.println("poder: Super força, Super Velocidade, Soltar fogo");
	}
	public void perdaEstamina(){
		estamina -= 10;
			if(estamina<=0) {			
				morrer();
			}
	}
	public void ganhoEstamina(){
		estamina += 5;
			if(estamina>100) {
				estamina = 100;
			}
	}

	protected void status() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Estamina: " +this.estamina);
		System.out.println("Altura: " +this.altura);
		System.out.println("vida: " +this.vida);
		System.out.println("Moeda: " +this.moedas);
		System.out.println("--------------------");
	}

	@Override
	public void revigorar() {
		estamina=100;
		
	}

	@Override
	public void morrer() {
		vida -=1 ;
		estamina = 100;
		if(vida>=0) {
			revigorar();
		}else {
			vida=0;
		}
	}

	@Override
	public void coletarMoeda() {
		moedas += 1;
		if(moedas==10) {
			moedas=0;
			vida+=1;
		}
	}
		
}
