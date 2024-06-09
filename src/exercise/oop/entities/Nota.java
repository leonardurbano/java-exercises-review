package exercise.oop.entities;

public class Nota {

	public double gradeA;
	public double gradeB;
	public double gradeC;

	public double sumNote() {
		return gradeA + gradeB + gradeC;
	}

	public boolean finalGradeNote() {
		return sumNote() >= 60 ? true : false;
	}

}
