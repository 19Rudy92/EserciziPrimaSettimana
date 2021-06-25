package esercizi0203.esercizio1;

public class Lavoratore extends Persona {
	private String matricolaLavoratore;
	private String azienda;
	private String dataAssunzione;
	private statoStudente statoLavoratore;

	public Lavoratore(String nome, String cognome, String matricolaLavoratore, String azienda, String dataAssunzione,
			statoStudente statoLavoratore) {
		super(nome, cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione = dataAssunzione;
		this.statoLavoratore = statoLavoratore;
	}

	public String infoLavoratore() {
		String partePersona = info();
		String infoLavoratore = partePersona + " " + matricolaLavoratore + " " + azienda + " " + dataAssunzione + " "
				+ statoLavoratore;
		return infoLavoratore;
	}

}
