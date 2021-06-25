package esercizi0203.esercizio3;

import java.time.LocalDate;

public class Macchina {
	private int numOrdine;
	private String marca;
	private LocalDate ingresso;
	private Lavorazione[] lavorazioni= new Lavorazione[10];

	public Macchina(int numOrdine, String marca, LocalDate ingresso) {
		this.numOrdine = numOrdine;
		this.marca = marca;
		this.ingresso = ingresso;
	}
	public boolean aggiungiLavorazione(Lavorazione lav) {
		for(int i = 0; i < lavorazioni.length; i++) {
			if(lavorazioni[i] == null) {
				lavorazioni[i] = lav;
				return true;
			}
		}
		return false;
			
	}
	public double sommaCostoLavorazioni() {
		double somma = 0;
		for(int i = 0; i < lavorazioni.length; i++) {
			if(lavorazioni[i] != null) {
				somma = somma + lavorazioni[i].getcosto();
			}
			
		} 
		return somma;
	}

	public int getnumRuote() {
		return numOrdine;
	}

	public String getmarca() {
		return marca;
	}

	public LocalDate getingresso() {
		return ingresso;
	}

}
