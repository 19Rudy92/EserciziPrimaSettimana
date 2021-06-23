package Esercizioperlunedi21;

import java.time.LocalDate;

public class Start {

	public static void main(String[] args) {
		Corso c1 = new Corso("Web Developer", Livello.INTERMEDIO, 450, 5000);
		Docente d1 = new Docente("Giorgio", "Rossi", true);
		EdizioneCorso ec = new EdizioneCorso(c1, "123be01", LocalDate.of(2021, 6, 14), LocalDate.of(2021, 9, 17), d1,
				10);
		Studente s1 = new Studente("Marco", "Gallotta", "GLTTMRC92A31A984L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s1);
		Studente s2 = new Studente("Luca", "Sisinni", "SSNLCA93A15A984L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s2);
		Studente s3 = new Studente("Sara", "Giuliano", "GLNSRA96L43E020S", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s3);
		Studente s4 = new Studente("Steven", "Martella", "MRTSTN97A02A984L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s4);
		Studente s5 = new Studente("Siria", "Nannini", "NNISRA97A25A020S", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s5);
		Studente s6 = new Studente("Silvia", "Cassol", "CSLSLVAFK2J23KBN", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s6);
		Studente s7 = new Studente("Davide", "Marrali", "MRLDVD32DKJ34N3L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s7);
		Studente s8 = new Studente("Stefano", "Ghirardi", "GRDSTN95A84RT32P", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s8);
		Studente s9 = new Studente("Andrea", "Monterosso", "MTSNDR89A23A984L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s9);
		Studente s10 = new Studente("Enzo", "Raco", "RCONZO91A081984L", LocalDate.of(1998, 1, 31));
		ec.iscrivi(s10);

		s1.listaAbilità[0] = new Abilità("Matematica", "Sottrazioni", Livello.INTERMEDIO);
		s2.listaAbilità[0] = new Abilità("Italiano", "Poesia", Livello.GURU);
		s3.listaAbilità[0] = new Abilità("Storia", "Roma", Livello.INTERMEDIO);
		s4.listaAbilità[0] = new Abilità("Matematica", "Moltiplicazioni", Livello.PRINCIPIANTE);
		s5.listaAbilità[0] = new Abilità("Disegno", "Geometria", Livello.GURU);
		s6.listaAbilità[0] = new Abilità("Italiano", "Grammatica", Livello.AVANZATO);
		s7.listaAbilità[0] = new Abilità("Geografia", "Italia", Livello.INTERMEDIO);
		s8.listaAbilità[0] = new Abilità("Matematica", "Divisioni", Livello.PRINCIPIANTE);
		s9.listaAbilità[0] = new Abilità("Inglese", "Scritto", Livello.INTERMEDIO);
		s10.listaAbilità[0] = new Abilità("Francese", "Orale", Livello.GURU);

		ec.report();

	}

}
