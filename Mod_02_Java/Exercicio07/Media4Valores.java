package Exercicio07;

import java.util.Scanner;

public class Media4Valores {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Voce ira digitar 4 valores:");
	System.out.println("Digite o 1� valor: ");
	double valor1 = scan.nextDouble();
	System.out.println("Digite o 2� valor: ");
	double valor2 = scan.nextDouble();
	System.out.println("Digite o 3� valor: ");
	double valor3 = scan.nextDouble();
	System.out.println("E agora Digite o 4� valor: ");
	double valor4 = scan.nextDouble();
	double valorFinal = (valor1 + valor2 + valor3 + valor4) / 4 ;
	System.out.println("A m�dia entre os valores digitados �: " + valorFinal);
	}

}
