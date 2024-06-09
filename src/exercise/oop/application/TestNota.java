package exercise.oop.application;

import java.util.Locale;
import java.util.Scanner;

import exercise.oop.entities.Nota;

public class TestNota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Nota n = new Nota();

		System.out.println(">>>Calculating quarter grades");
		System.out.print("Student: ");
		sc.nextLine();
		System.out.println("Grades:");
		n.gradeA = sc.nextInt();
		n.gradeB = sc.nextInt();
		n.gradeC = sc.nextInt();
		System.out.println("---------------------");
		System.out.printf("FINAL GRADE: %.2f%n", n.sumNote());

		if (n.finalGradeNote()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.1f POINTS%n", (60 - n.sumNote()));
		}

		sc.close();
	}
}
