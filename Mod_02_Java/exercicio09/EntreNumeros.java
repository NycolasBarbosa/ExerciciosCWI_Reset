package exercico09;

import java.util.Scanner;

public class EntreNumeros {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		while(num1>=num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digita valor 1: ");
		num1 = scan.nextInt();
		System.out.println("digita valor 2: ");
		num2 = scan.nextInt();
		if(num1!=num2 && num1<num2) {
			for(int i=num1 ;i<=num2;i++) {
				System.out.println(""+i);
			}
		}
		}
		
	}
}
