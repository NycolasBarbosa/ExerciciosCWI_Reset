package exercicio10;

import java.util.Scanner;

public class ArreyMaiorDeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int cont = 0;
		for(int i = 0; i<idades.length; i++) {
			System.out.println("Informe a idade:");
			idades[i] = scan.nextInt();
			if(idades[i]>=18) {
				cont++;
			}
		}
		for(int i = 0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
			
		System.out.println(cont+" Pessoas são maiores de idade.");
	}
}
