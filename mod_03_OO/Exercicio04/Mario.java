package mario;

public class Mario {
	private String nome;
	private int idade;
	private float altura;
	private String profissao;
	private String missao;
	private int estamina;
	private boolean cogumelo;
	
	
	
	public Mario(String nome, int idade, float altura, int estamina){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = estamina;
	}

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
		System.out.println("Nome: " +this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Altura: " +this.getAltura());
		System.out.println("Profissão: " +this.getProfissao());
		System.out.println("Missão: " +this.getMissao());
		System.out.println("Estamina: " +this.getEstamina());
		System.out.println("Cogumelo: " +this.getCogumelo());
		poderes();
		System.out.println("");
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEstamina() {

		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
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
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao=profissao;
	}
	
	public String getMissao() {
		return missao;
	}
	public void setMissao(String missao) {
		this.missao=missao;
	}

	public boolean getCogumelo() {
		return cogumelo;
	}
	public void setCogumelo(boolean cogumelo) {
		this.cogumelo=cogumelo;
	}
}
