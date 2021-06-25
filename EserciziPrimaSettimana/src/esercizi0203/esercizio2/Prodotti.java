package esercizi0203.esercizio2;

public class Prodotti {
	private static int codiceUnivoco;
	private String descrizione;
	private double prezzo;

	public int getcodiceUnivoco() {
		return codiceUnivoco;
	}

	public String getdescrizione() {
		return descrizione;
	}

	public double getprezzo() {
		return prezzo;
	}

	public void applicaSconto() {
		prezzo = prezzo - (prezzo * 0.05);
	}

	public String datiProdotto() {
		return codiceUnivoco + " " + descrizione + " " + prezzo;
	}

}
