package mario;

public class Mario2 {

	public static void main(String[] args) {
		/*
		Mario m1= new Mario();
		m1.nome = "Mario";
		m1.profissao = "Encanador";
		m1.missao = "salvar a princesa";
		m1.comerCogumelo();
		m1.imprimir();
		
		System.out.println("");
		
		Mario m2= new Mario();
		m2.nome = "Mario";
		m2.profissao = "Encanador";
		m2.missao = "salvar a princesa";
		//m2.cogumelo = false; <-private
		m2.imprimir();
*/
		Mario m1 = new Mario("Mario Bros",40,1.50f,100);
		m1.setMissao("Salvar a princesa");
		m1.setProfissao("Mecanico Hidraulico");
		m1.comerCogumelo();
		m1.ganhoEstamina();
		m1.imprimir();
		
		Mario m2 = new Mario("Mario",40,1.0f,5);
		m2.setMissao("Derrotar o BOSS");
		m2.setProfissao("Encanador");
		m2.perdaEstamina();
		m2.imprimir();
	}

}
