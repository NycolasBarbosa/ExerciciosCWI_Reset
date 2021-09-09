package exercicio09;

public class AppJogoMario {

	public static void main(String[] args) {
		//Personagem p = new Personagem("Nycolas",27,1.83f);
		
		Mario m= new Mario("mario",40,1.60f);
		Luigi l= new Luigi("Luigi",42,1.80f);
		Yoshi y= new Yoshi("Yoshi",10,1.50f);
		l.voar();
		m.montarYoshi(y);
		m.imprimirTacomYosh();
		y.comerFruta();
		m.saltar();
		l.saltar(1.5f);
	}

}
