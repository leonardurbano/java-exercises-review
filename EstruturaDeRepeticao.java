import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0, value;
		char back = 'n';

		do {
			System.out.print(back != 'n' ? "\n" : "");
			System.out.println(">>Enter whole numbers for sum");
			System.out.println(">>>>>>>>To finish, press zero:");

			while ( ( value = sc.nextInt() ) != 0 ) {
				sum += value;
			}

			System.out.println("---------------\nTotal sum: " + sum + "\n---------------");
			sum = 0;

			System.out.println("Repeat the sum? (yes|no):");
			back = sc.next().charAt(0);

		} while (back == 'y' ? true : false);

		System.out.println("\nTerminated...");

		sc.close();
	}
}
