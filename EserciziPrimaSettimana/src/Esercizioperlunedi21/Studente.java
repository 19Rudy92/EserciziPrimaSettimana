package Esercizioperlunedi21;

import java.time.LocalDate;

public class Studente {
	public String nome;
	public String cognome;
	public String codiceFiscale;
	public LocalDate dataDiNascita;
	public Abilità[] listaAbilità = new Abilità[2];

	public Studente(String nome, String cognome, String codiceFiscale, LocalDate dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.dataDiNascita = dataDiNascita;
	}

}
