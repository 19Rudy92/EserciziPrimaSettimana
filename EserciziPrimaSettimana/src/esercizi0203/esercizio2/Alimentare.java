package esercizi0203.esercizio2;

import java.time.LocalDate;

public class Alimentare extends Prodotti {
	private LocalDate dataDiScadenza;
	private boolean vegano;

	public Alimentare(LocalDate dataDiScadenza, boolean vegano) {
		super();
		this.dataDiScadenza = dataDiScadenza;
		this.vegano = vegano;
	}

	public boolean veganoSiNo() {
		return vegano;
	}

	public LocalDate getdataDiScadenza() {
		return dataDiScadenza;
	}

	public boolean getvegano() {
		return vegano;
	}
	public void stampaDatiProdotti() {
		System.out.println("Il prodotto scade il " + dataDiScadenza);
		System.out.println("è vegano? " + vegano);
		
	}
}
