package exercicio10;

import java.util.Random;

public class Arrey01 {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int[] numerosX2 = new int[5];
		Random rand = new Random();
		for(int i=0; i<numeros.length; i++) {
			numeros[i]= rand.nextInt(10);
			numerosX2[i]=numeros[i]*2;
		System.out.println("1º vetor="+numeros[i]+" 2º vetor="+numerosX2[i]);
		}
	}

}
