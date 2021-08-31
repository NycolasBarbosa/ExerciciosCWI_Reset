package mario;

public class Mario2 {

	public static void main(String[] args) {
		Mario m1= new Mario();
		m1.nome = "Mario";
		m1.profissao = "Encanador";
		m1.missao = "salvar a princesa";
		m1.cogumelo = true;
		m1.imprimir();
		System.out.println("");
		Mario m2= new Mario();
		m2.nome = "Mario";
		m2.profissao = "Encanador";
		m2.missao = "salvar a princesa";
		m2.cogumelo = false;
		m2.imprimir();

	}

}
