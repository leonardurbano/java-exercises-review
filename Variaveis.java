import java.util.Locale;

public class Variaveis {

	/**
	 * Working with Variable
	 * Set locale US, compatible between print e printf 
	 */
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		String name = "Fulano";
		int age = 47;
		double salary = 5400.58;
		double taxINSS = 0.05;
		
		System.out.println("##################################");
		System.out.println("Employee - Gross salary: $" + salary);
		System.out.println("##################################");
		System.out.printf("Name: %s%nAge: %d%nNet salary: $ %.2f%n", name, age, (salary -= (salary * taxINSS)));
		System.out.println("##################################");
		
		
		
		
		
		
		
	}
}
