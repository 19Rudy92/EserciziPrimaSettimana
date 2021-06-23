package Esercizioperlunedi21;

public class Corso {
	public String nomeCorso;
	public int durataOre;
	public Livello livelloDifficoltà;
	public double costo;

	public Corso(String nomeCorso, Livello livelloDifficoltà, int durataOre, double costo) {
		this.nomeCorso = nomeCorso;
		this.livelloDifficoltà = livelloDifficoltà;
		this.durataOre = durataOre;
		this.costo = costo;

	}

}
