package exercise.oop.application;

import java.util.Locale;
import java.util.Scanner;

import exercise.oop.entities.Product;

public class TestProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(">>>Enter product data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: $ ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);
		
		System.out.println("----------------------------------------------------+");
		System.out.println("Product data: " + product);
		System.out.println("----------------------------------------------------+");

		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.println("----------------------------------------------------+");
		System.out.println("Update data: " + product);
		System.out.println("----------------------------------------------------+");

		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		System.out.println("----------------------------------------------------+");
		System.out.println("Update data: " + product);
		System.out.println("----------------------------------------------------+");

		sc.close();
	}

}
