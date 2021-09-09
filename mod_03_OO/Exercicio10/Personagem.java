package exercicio09;

public abstract class Personagem {
	private String nome;
	private int idade;
	protected float altura;
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

	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void revigorar() {
		estamina=100;
		
	}

	public int getMoedas() {
		return moedas;
	}
	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}
	
	public void morrer() {
		vida -=1 ;
		estamina = 100;
		if(vida>=0) {
			revigorar();
		}else {
			vida=0;
		}
	}

	public abstract void crescer();
		/*altura = altura*2;
		System.out.println("poder: Super força, Super Velocidade, Soltar fogo");
	*/
	

		
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

	public void saltar() {
		System.out.println(this.getNome()+" saltou: "+altura*0.5f);
		
	}
	public void saltar(float alturaObstaculo) {
		System.out.println(this.getNome()+" esta saltando um obstaculo de : "+alturaObstaculo+" e efetuando um salto de: "+alturaObstaculo*1.5f+" de altura");
	}
		
}



