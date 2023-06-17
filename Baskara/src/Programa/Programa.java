package Programa;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua equação de baskara que vou resolver!");
	try {	
		System.out.print("Digite o a: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite o b: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);

		System.out.println();
		
		if(delta > 0) {
			System.out.printf("Delta = %.0f%n",delta);
			System.out.printf("X1 = %.2f%n",x1);
			System.out.printf("X2 = %.2f%n",x2);
			System.out.println("A equação tem duas soluções reais pois o delta é maior que zero");
		}else if (delta == 0) {
			System.out.printf("Delta = %.0f%n",delta);
			System.out.printf("X = %.2f%n",x1);
			System.out.println("A equação só tem uma solução real pois o delta é igual a zero");
		}else if (delta < 0) {
			System.out.printf("Delta = %.0f%n",delta);
			System.out.printf("X1 = %.2f%n",x1);
			System.out.printf("X2 = %.2f%n",x2);
			System.out.println("A equação não tem solução real pois o delta é menor que zero");
		}
		sc.close();
	}catch(InputMismatchException e) {
		System.out.println("Digite um número por favor!");
	}
  }
}
