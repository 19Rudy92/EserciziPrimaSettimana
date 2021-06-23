package EsercizioMartedi22;

public class main {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente("A10A", Dipartimento.AMMINISTRAZIONE);
		Dipendente d2 = new Dipendente("P21D", Dipartimento.PRODUZIONE, 2000, 50, Livello.IMPIEGATO);
		Dipendente d3 = new Dipendente("P73O", Dipartimento.PRODUZIONE, 2000, 50, Livello.OPERAIO);
		Dipendente d4 = new Dipendente("P76O", Dipartimento.PRODUZIONE, 2000, 50, Livello.OPERAIO);
		Dipendente d5 = new Dipendente("V48D", Dipartimento.VENDITE, 2000, 50, Livello.DIRIGENTE);
		Dipendente d6 = new Dipendente("A39D", Dipartimento.AMMINISTRAZIONE, 2000, 50, Livello.IMPIEGATO);
		Dipendente d7 = new Dipendente("P20Q", Dipartimento.PRODUZIONE, 2000, 50, Livello.QUADRO);
		Dipendente d8 = new Dipendente("V07I", Dipartimento.VENDITE, 2000, 50, Livello.IMPIEGATO);
		Dipendente d9 = new Dipendente("V90Q", Dipartimento.VENDITE, 2000, 50, Livello.QUADRO);

		Livello l2 = d2.promozioneDipendente();
		d2.stampaDatiDipendente(); // oggetto . metodo
		Livello l3 = d3.promozioneDipendente();
		Livello l4 = d6.promozioneDipendente();
		Dipendente[] x = { d3, d4, d5, d6 };
		for (int i = 0; i < x.length; i++) {
			x[i].stampaDatiDipendente();

		}
		double sommaStipendi = 0;
		for (int i = 0; i < x.length; i++) {
			x[i].setOreStraordinario(5);
			sommaStipendi = sommaStipendi + x[i].calcolaStipendioTotale();
		}
		System.out.println("La somma degli stipendi è: " + sommaStipendi);
		sommaStipendi = 0;
		for (int i = 0; i < x.length; i++) {
			//sommaStipendi = sommaStipendi + Dipendente.calcolaPaga(x[i], 5);
			sommaStipendi = sommaStipendi + x[i].calcolaStipendioTotale(5);
			
		}
	}

}
