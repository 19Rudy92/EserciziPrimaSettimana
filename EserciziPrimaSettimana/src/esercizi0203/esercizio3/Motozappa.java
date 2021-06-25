package esercizi0203.esercizio3;

import java.time.LocalDate;

public class Motozappa extends Macchina {
	private int numFrese;
	

	public Motozappa(int numOrdine, String marca, LocalDate ingresso, int numFrese) {
		super(numOrdine, marca, ingresso);
		this.numFrese = numFrese;
	}

	public int getnumFrese() {
		return numFrese;
	}

}
