package exercise.oop.util;

public class CurrencyConverter {
	
	private static double tax = 0.06;
	
	public static final double cal(double dollarValue, double manyDollars) {

		tax *= dollarValue * manyDollars;
		return dollarValue * manyDollars + tax;
	}
	
}
