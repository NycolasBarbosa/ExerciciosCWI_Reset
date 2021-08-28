package Exercicio07;

import java.util.Scanner;

public class Media4Valores {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Voce ira digitar 4 valores:");
	System.out.println("Digite o 1º valor: ");
	double valor1 = scan.nextDouble();
	System.out.println("Digite o 2º valor: ");
	double valor2 = scan.nextDouble();
	System.out.println("Digite o 3º valor: ");
	double valor3 = scan.nextDouble();
	System.out.println("E agora Digite o 4º valor: ");
	double valor4 = scan.nextDouble();
	double valorFinal = (valor1 + valor2 + valor3 + valor4) / 4 ;
	System.out.println("A média entre os valores digitados é: " + valorFinal);
	}

}
