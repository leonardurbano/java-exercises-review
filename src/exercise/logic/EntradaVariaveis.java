package exercise.logic;
import java.util.Locale;
import java.util.Scanner;

public class EntradaVariaveis {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(">>>>>>> Enter your name:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.println("------------------------");
		System.out.printf("You typed: %s%n%n", name);

		sc.close();
	}
}
