package exercico09;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		for(int i = 0;i<=10;i++) {
			//System.out.println("Digite um valor");
			//int valor = scan.nextInt();
			int resultado = valor*i;
			System.out.println(valor+"x"+i+"="+resultado);
		}

	}

}
