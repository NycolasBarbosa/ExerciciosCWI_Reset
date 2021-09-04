package mario;

public class Mario2 {

	public static void main(String[] args) {
		Personagem m= new Personagem("Mario",40,1.60f);
		m.coletarMoeda();
		m.coletarMoeda();
		m.crescer();
		m.saltar();
		m.status();
		
		Personagem l= new Personagem("Luige",42,1.80f);
		l.crescer();
		l.saltar();
		l.morrer();
		l.status();

	}

}
