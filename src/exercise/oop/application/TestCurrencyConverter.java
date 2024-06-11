package exercise.oop.application;

import java.util.Locale;
import java.util.Scanner;

import exercise.oop.util.CurrencyConverter;

public class TestCurrencyConverter {

	public static void main(String[] args) {

		/**
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------+");
		System.out.println(">>>>Calculate the value of\n" + ">>>>your certification");
		System.out.println("----------------------------------------+");
		System.out.print("What is the dollar price? R$ ");
		double dolarValue = sc.nextDouble();

		System.out.print("How many dollars will be bought? $ ");
		double quantityDollars = sc.nextDouble();

		System.out.println("----------------------------------------+");
		System.out.printf("Amount to be paid in reais = %.2f%n", 
				CurrencyConverter.cal(dolarValue, quantityDollars));

		sc.close();
	}

}
