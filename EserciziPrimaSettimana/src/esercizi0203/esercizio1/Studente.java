package esercizi0203.esercizio1;

public class Studente extends Persona {
	private int matricolaStudente;
	private String corsoDiLaurea;
	private statoStudente statoStudente;

	public Studente(String nome, String cognome, int matricolaStudente, String corsoDiLaurea,
			statoStudente statoStudente) {
		super(nome, cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = corsoDiLaurea;
		this.statoStudente = statoStudente;
	}

	public String infoStudente() {
		String partePersona = info();
		String infoStudente = partePersona + " " + matricolaStudente + " " + corsoDiLaurea + " " + statoStudente;
		return infoStudente;
	}

}
