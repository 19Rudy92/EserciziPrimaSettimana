package esercizi0203.esercizio3;

import java.time.LocalDate;

public class Tosaerba extends Macchina {
	private int nRuote;

	public Tosaerba(int numOrdine, String marca, LocalDate ingresso, int nRuote) {
		super(numOrdine, marca, ingresso);
		this.nRuote = nRuote;
	}

	public int getnRuote() {
		return nRuote;
	}

}
