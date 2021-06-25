package esercizi0203.esercizio2;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Merceologica m1 = new Merceologica("Quaderno", 1050);
		Merceologica m2 = new Merceologica("Piatto", 298);
		Alimentare a1 = new Alimentare(LocalDate.of(2021, 11, 01), true);
		Alimentare a2 = new Alimentare(LocalDate.of(2022, 01, 13), false);
		Merceologica m3 = new Merceologica("Accetta", 2112);
		Alimentare a3 = new Alimentare(LocalDate.of(2021, 01, 10), false);

		a1.stampaDatiProdotti();
		a2.stampaDatiProdotti();
		a3.stampaDatiProdotti();
		m1.stampaDatiProdotto();
		m2.stampaDatiProdotto();
		m3.stampaDatiProdotto();

	}

}
