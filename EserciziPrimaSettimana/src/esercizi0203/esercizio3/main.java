package esercizi0203.esercizio3;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Motozappa m1 = new Motozappa(03, "Becker", LocalDate.of(2021, 01, 05), 6);
		Decespugliatore d1 = new Decespugliatore(05, "Amazone", LocalDate.of(2021, 01, 03), true);
		Motozappa m2 = new Motozappa(02, "Accord", LocalDate.of(2021, 01, 10), 6);
		Tosaerba t1 = new Tosaerba(01, "Becker", LocalDate.of(2021, 01, 17), 4);

	}

}
