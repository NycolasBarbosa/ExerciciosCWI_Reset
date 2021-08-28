package exercicio08;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um valor:");
	
	int dia = scan.nextInt();

	switch(dia){
	case(1): System.out.println("Domingo"); break;
	case(2): System.out.println("Segunda"); break;
	case(3): System.out.println("Terça-Feira"); break;
	case(4): System.out.println("Quarta-Feira"); break;
	case(5): System.out.println("Quinta-Feira"); break;
	case(6): System.out.println("Sexta-feita"); break;
	case(7): System.out.println("Sabado"); break;
	default: System.out.println("Valor invalido");
	}
	
	}
}
