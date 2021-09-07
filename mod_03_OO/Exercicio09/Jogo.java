package exercicio09;

import java.util.Random;

import mario.Personagem;

public class Jogo {
	private Personagem jogador1;
	private Personagem jogador2;
	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.setJogador1(jogador1);
		this.setJogador2(jogador2);
	}
	
	public void statusJogo() {
		jogador1.status();
		jogador2.status();
	}
	
	public void jogar() {
		 Random rdm = new Random();
		 int x1= rdm.nextInt(30);
		 int x2= rdm.nextInt(30);
		
		 for(int i= 0; i < x1; i++) {
		 jogador1.coletarMoeda();
		}
		for(int i= 0; i < x2-1; i++) {
			jogador2.coletarMoeda();	
		}	
		
		statusJogo();
		System.out.println( this.jogador1.getNome()+" coletou moedas "+x1+"vezes");
		System.out.println(this.jogador2.getNome()+" coletou moedas "+x2+"vezes");
	}
	public Personagem getJogador1() {
		return jogador1;
	}

	public void setJogador1(Personagem jogador1) {
		this.jogador1 = jogador1;
	}

	public Personagem getJogador2() {
		return jogador2;
	}

	public void setJogador2(Personagem jogador2) {
		this.jogador2 = jogador2;
	}
}
