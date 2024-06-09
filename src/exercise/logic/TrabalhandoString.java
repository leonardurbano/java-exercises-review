package exercise.logic;
public class TrabalhandoString {

	public static void main(String[] args) {
		
		String title = "Inteligência artificial é avanço mais importante da tecnologia em décadas, diz Bill Gates";
		String post = "Gates, no entanto, afirma que o desenvolvimento da tecnologia de IA necessita de uma abordagem "
				+ "direcionada: As forças do mercado não produzirão naturalmente produtos e serviços de IA que ajudem "
				+ "os mais pobres.";

		System.out.println(title.toUpperCase());
		System.out.print("Post: ");
		System.out.println(post.substring(0, 80).trim() + "\n" + post.substring(80, 110).trim() + "..");

		System.out.println("------------");

		System.out.print("Post: ");
		System.out.println(post.replace("Gates, ", "").replace("no ", "No ").substring(0, 80).trim() + "...");

		System.out.println("------------");
		
		int indexGates = post.indexOf("Gates");
		int indexSpace = post.indexOf(", ");
		
		System.out.println("Name: " + post.substring(indexGates, indexSpace));
		
		
		System.out.println("------------");

		String[] vect = post.replace(", ", " ").replace(" no ", " ").replace(" o ", " ").replace(" da ", " ")
				.replace(" de ", " ").substring(0, 60).trim().split(" ");

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Vect[%d]: %s%nCharacter-size(%d)%n%n", i, vect[i], vect[i].length());
		}
		
	}
}
