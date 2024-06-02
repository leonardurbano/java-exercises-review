import java.util.Date;
import java.util.Scanner;

public class EstruturaCondicial {

	public static void main(String[] args) {

		// getHoras - Method Depreciated
		int hora = new Date().getHours();

		Scanner sc = new Scanner(System.in);

		System.out.print(">>>>Enter your name: ");
		String name = sc.nextLine();

		if (hora > 2 && hora < 12) {
			System.out.println("Bom dia, " + name);
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde, " + name);
		} else {
			System.out.println("Boa noite, " + name);
		}

		System.out.println("-----------------------");

		sc.close();
	}

}
