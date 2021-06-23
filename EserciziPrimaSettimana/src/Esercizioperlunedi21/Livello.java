package Esercizioperlunedi21;

public enum Livello {
	PRINCIPIANTE(0), INTERMEDIO(1), AVANZATO(2), GURU(3);

	public int number;

	Livello(int n) {
		number = n;

	}

	public boolean isExpert() {
		return this == Livello.AVANZATO || this == Livello.GURU;
	}
}
