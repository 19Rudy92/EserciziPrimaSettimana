package esercizi0203.esercizio1;

public class Persona {
	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		nome = nome;
		cognome = cognome;
	}

	public String info() {
		return nome + " " + cognome;
	}

	public String getnome() {
		return nome;
	}

	public String getcognome() {
		return cognome;
	}

}
