package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Aula inicial de Git Github com estrutura do While

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O programa faz a conversao entre Farenheit e Celsius!");
		System.out.println();

		double C, F;
		char resp;

		do {
			System.out.print("Digite a temperatura Celsius:");
			C = sc.nextDouble();
			F = C * 9.0 / 5.0 + 32.0;
			System.out.printf("O equivalente em Fahrenheit é:%.1f%n", F);
			System.out.print("Deseja repetir: (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
