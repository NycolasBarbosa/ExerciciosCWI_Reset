package exercicio08;


import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o valor da 1ª nota: ");
	double valor1 = scan.nextDouble();
	
	System.out.println("Digite o valor da 2ª nota: ");
	double valor2 = scan.nextDouble();
	
	System.out.println("Digite o valor da 3ª nota:");
	double valor3 = scan.nextDouble();
	
	System.out.println("Digite o valor da 4ª nota: ");
	double valor4 = scan.nextDouble();
	
	double nota = (valor1 + valor2 + valor3 + valor4) / 4 ;
	
	if(nota == 10) {
		System.out.println("Aprovado com louvor");
		} else if(nota >= 7){
			System.out.println("Aprovado");
	}else {System.out.println("Reprovado");
	}
	System.out.println("A sua média foi: "+nota);
  }
}