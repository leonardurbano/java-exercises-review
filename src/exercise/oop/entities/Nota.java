package exercise.oop.entities;

public class Nota {

	public double noteA;
	public double noteB;
	public double noteC;

	public double sumNote() {
		return noteA + noteB + noteC;
	}

	public boolean finalGradeNote() {
		return sumNote() >= 60 ? true : false;
	}

}
