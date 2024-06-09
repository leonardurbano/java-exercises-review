package exercise.logic;
import java.util.Scanner;

public class TrabalhandoFuncoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">>>Discover the greatest value");
		System.out.println("Enter three whole numbers:");
		System.out.println("-------------------------");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int highest = max(a, b, c);

		showResult(highest);

		sc.close();
	}
	
	
	// Retorna o maior valor
	public static int max(int a, int b, int c) {
		int max;

		if (a > b && a > c) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}

		return max;
	}

	
	// Imprime o resultado
	public static void showResult(int value) {
		System.out.println("------------------------+");
		System.out.println("Highest value: " + value);
		System.out.println("------------------------+");
	}
	
}
