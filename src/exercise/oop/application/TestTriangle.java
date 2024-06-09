package exercise.oop.application;

import java.util.Locale;
import java.util.Scanner;

import exercise.oop.entities.Triangle;

public class TestTriangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Calculating the area of ​​triangles (X and Y)");
		System.out.println(">>>Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println(">>>Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		char max;

		if (areaX > areaY) {
			max = 'X';
		} else {
			max = 'Y';
		}

		System.out.println("--------------------------------------");
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.printf("Largest area between the triangles: %s%n", max);
		System.out.println("--------------------------------------");

		sc.close();
	}

}
