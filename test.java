import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0, value;
		String voltar = "";

		do {
			System.out.print((voltar != "") ? "\n" : "");
			System.out.println("Digite numeros inteiro para somar:");
			
			while ((value = sc.nextInt()) != 0) {
				sum += value;
			}

			System.out.println("---------------\nA soma foi: " + sum + "\n---------------");
			sum = 0;

			System.out.println();

			System.out.println("Deseja continuar? sim|nao");
			voltar = sc.next();

		} while (voltar.equals("sim") ? true : false);

		System.out.println("Terminated...");

		sc.close();
	}
}
