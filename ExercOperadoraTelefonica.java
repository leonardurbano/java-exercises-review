import java.util.Locale;
import java.util.Scanner;

public class ExercOperadoraTelefonica {

	/*
	 * Task >> Problema exemplo: Uma operadora de telefonia cobra R$ 50.00 por um
	 * plano básico que dá direito a 100 mintos de telefone. Cada minuto que exceder
	 * a franqui de 100 minutos custa R$ 2.00. Fazer um programa para ler a
	 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser
	 * pago.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(">>>>>>Your Basic Plan");
		System.out.print("Enter the number of minutes: ");
		double min = sc.nextDouble();
		double value = 50.00;

		if (min > 100) {
			value += (min - 100) * 2.0;
		}

		System.out.printf("Amount payable: $ %.2f%n", value);

		sc.close();
	}
}