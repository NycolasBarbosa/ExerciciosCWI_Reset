package mario;

public class Personagem implements MarioInterface{
	private String nome;
	private int idade;
	private float altura;
	private int estamina;
	private int vida;
	private int moedas;
	
 	public Personagem(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
		this.vida = 1;
		this.moedas = 0; 
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

	public int getMoedas() {
		return moedas;
	}
	public void setMoedas(int moedas) {
		this.moedas = moedas;
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

	public void crescer() {
		altura = altura*2;
		System.out.println("poder: Super força, Super Velocidade, Soltar fogo");
	}

		@Override
	public void coletarMoeda() {
		moedas++ ;
		if(moedas==10) {
			vida++;
			moedas=0;
			
		}
	}
	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	@Override
	public void saltar() {
		if(nome == "Mario"){
			System.out.println("Esta Pulando a uma altura de: " + altura / 2);
		}else if(nome == "Luige") {
			System.out.println("Esta pulando a uma altura de: "+ altura*2);
		}else {
			System.out.println("Personagem Invalido:");
		}
		
	}
		
}
