package Exercicio07;

import java.util.Scanner;

public class SalarioMensal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos Calcular seu salario mensal:");
		System.out.println("Quanto voce recebe por hora? ");
		double valorHora = scan.nextDouble();
		System.out.println("Quantas horas voce trabalhou este mês?");
		double horasTrabalho = scan.nextDouble();
		double salario = valorHora*horasTrabalho;
		System.out.println("Seu salario mensal é de: " + salario);
	}

}
