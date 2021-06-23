package Esercizioperlunedi21;

import java.time.LocalDate;

public class EdizioneCorso {
	public Corso corso;
	public String codice;
	public LocalDate dataDiPartenza;
	public LocalDate dataDiChiusura;
	public final int NUM_MAX_STUDENTI;
	public Studente[] studentiIscritti;
	public Docente docente;

	public EdizioneCorso(Corso corso, String codice, LocalDate dataDiPartenza, LocalDate dataDiChiusura,
			Docente docente, int maxIscritti) {
		this.corso = corso;
		this.codice = codice;
		this.dataDiPartenza = dataDiPartenza;
		this.dataDiChiusura = dataDiChiusura;
		this.docente = docente;
		this.NUM_MAX_STUDENTI = maxIscritti;
		this.studentiIscritti = new Studente[NUM_MAX_STUDENTI];
	}

	public void report() {
		System.out.println("Il codice edizione è " + codice + "e parte il " + dataDiPartenza + ".");
		System.out.println("Il nome del corso è " + corso.nomeCorso);
		for (int i = 0; i < studentiIscritti.length; i++) {
			if (studentiIscritti[i] != null) {
				System.out.println(studentiIscritti[i].nome + " " + studentiIscritti[i].cognome);
				for (int j = 0; j < studentiIscritti[i].listaAbilità.length; j++) {
					if (studentiIscritti[i].listaAbilità[j] != null) {
						System.out.println(studentiIscritti[i].listaAbilità[j].nome);
						System.out.println(studentiIscritti[i].listaAbilità[j].livello);
					}
				}

			}
		}

	}

	public boolean iscrivi(Studente s) {
		for (int i = 0; i < studentiIscritti.length; i++) {
			if (studentiIscritti[i] == null) {
				studentiIscritti[i] = s;
				return true;
			}
		}
		return false;

	}

	public boolean iscrivi2(Studente s) {
		boolean found = false;
		for (int i = 0; i < studentiIscritti.length; i++) {
			if (studentiIscritti[i] == null) {
				studentiIscritti[i] = s;
				found = true;
				break;
			}
		}
		return found;

	}

	public EdizioneCorso(Corso corso, String codice, LocalDate dataDiPartenza, LocalDate dataDiChiusura,
			Docente docente, Studente[] studentiIscritti) {
		this.corso = corso;
		this.codice = codice;
		this.dataDiPartenza = dataDiPartenza;
		this.dataDiChiusura = dataDiChiusura;
		this.docente = docente;
		this.NUM_MAX_STUDENTI = studentiIscritti.length;
		this.studentiIscritti = studentiIscritti;

	}
}
