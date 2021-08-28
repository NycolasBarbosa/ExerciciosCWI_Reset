package exercico09;

import java.util.Scanner;

public class Nota0a10 {
	public static void main(String[] args) {
		double nota = 0;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10:");
		nota = scan.nextDouble();
		if(nota>=0 && nota<=10) {
			System.out.println(""+nota);
		}
		}while(nota<0 || nota>10);
		
				
		
	}

}
