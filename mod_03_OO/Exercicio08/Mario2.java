package mario;

public class Mario2 {

	public static void main(String[] args) {
		Personagem m= new Personagem("Mario",40,1.60f);	
		Personagem l= new Personagem("Luige",42,1.80f);
		
		Jogo sm = new Jogo(m,l);
		sm.jogar();
	}
}
