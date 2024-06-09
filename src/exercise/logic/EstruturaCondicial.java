package exercise.logic;
import java.util.Date;
import java.util.Scanner;

public class EstruturaCondicial {

	public static void main(String[] args) {

		// getHoras - Method Depreciated
		@SuppressWarnings("deprecation")
		int hora = new Date().getHours();

		Scanner sc = new Scanner(System.in);

		System.out.print(">>>>Enter your name: ");
		String name = sc.nextLine();

		if (hora > 2 && hora < 12) {
			System.out.println("Good morning, " + name);
		} else if (hora > 12 && hora < 18) {
			System.out.println("Good afternoon, " + name);
		} else {
			System.out.println("Good night, " + name);
		}

		System.out.println("-----------------------");

		sc.close();
	}

}
