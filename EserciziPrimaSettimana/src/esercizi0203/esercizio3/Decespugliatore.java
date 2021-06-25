package esercizi0203.esercizio3;

import java.time.LocalDate;

public class Decespugliatore extends Macchina {
	private boolean accElett;

	public Decespugliatore(int numOrdine, String marca, LocalDate ingresso, boolean accElett) {
		super(numOrdine, marca, ingresso);
		this.accElett = accElett;
	}
	public boolean accensioneElettricaSiNo() {
		return accElett;
	}

	public boolean getaccElett() {
		return accElett;
	}

}
