package Exercicio07;

import java.util.Scanner;

public class Soma2Numeros {


	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("digite um valor:");
	int valor1 = scan.nextInt();
	
	System.out.println("digite outro valor:");
	int valor2 = scan.nextInt();
	int valor = valor1 + valor2;
	System.out.println("A soma dos valores é: "+valor);
	
	}

}