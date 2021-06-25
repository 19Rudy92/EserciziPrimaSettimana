package esercizi0203.esercizio3;

public class Lavorazione {				//LA CLASSE LAVORAZIONE LA ABBIAMO CREATA PER POTER DARE UN COSTO ALLE VARIE LAVORAZIONI CHE ANDREMO A FARE
	
	private double costo;								

	public Lavorazione(double costo) {
		this.costo = costo;
	}
	
	public double getcosto() {
		return costo;
	}

}
