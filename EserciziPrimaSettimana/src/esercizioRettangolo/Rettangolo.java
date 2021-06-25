package esercizioRettangolo;

public class Rettangolo {
	public double base; // attributi del
	public double altezza; // mio rettangolo

	public Rettangolo(double base, double altezza) { // evoco il costruttore
		this.base = base; // di default
		this.altezza = altezza;

	}

	public double area() { // metodo per
		return base * altezza; // l area
	}

	public double perimetro() { // metodo per trovare
		return (base + altezza) * 2; // il perimetro
	}

}
