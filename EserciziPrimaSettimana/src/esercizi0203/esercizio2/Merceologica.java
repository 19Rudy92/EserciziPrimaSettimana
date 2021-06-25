package esercizi0203.esercizio2;

public class Merceologica {
	private String nome;
	private int codice;

	public Merceologica(String nome, int codice) {
		super();
		this.nome = nome;
		this.codice = codice;
	}

	public String getnome() {
		return nome;
	}

	public int getcodice() {
		return codice;
	}
	public void stampaDatiProdotto() {
		System.out.println("Il prodotto " + codice);
		System.out.println("è " + nome);
	}
}
