package exercico09;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o 1� valor:");
		int num1 = scan.nextInt();
		System.out.println("Digite o 2� valor:");
		int num2 = scan.nextInt();
		System.out.println("Digite o 3� valor:");
		int num3 = scan.nextInt();
		System.out.println("Digite o 4� valor:");
		int num4 = scan.nextInt();
		System.out.println("Digite o 5� valor:");
		int num5 = scan.nextInt();
		
		if(num1<=num5 && num2<=num5 && num3<=num5 && num4<=num5) {
			System.out.println("O maior numero digitado �: "+num5);
		}else if(num1<=num4 && num2<=num4 && num3<=num4 && num5<=num4) {
			System.out.println("O maior numero digitado �: "+num4);
		}else if(num1<=num3 && num2<=num3 && num4<=num3 && num5<=num3) {
			System.out.println("O maior numero digitado �: "+num3);
		}else if(num1<=num2 && num3<=num2 && num4<=num2 && num5<=num2) {
			System.out.println("O maior numero digitado �: "+num2);
		}else if(num2<=num1 && num3<=num1 && num4<=num1 && num5<=num1) {
			System.out.println("O maior numero digitado �: "+num1);
		}
	}

}
