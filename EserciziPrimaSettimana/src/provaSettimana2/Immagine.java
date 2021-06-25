package provaSettimana2;

public class Immagine extends ElementoMultimediale {
	private int Luminosit�;

	public Immagine(String titolo, boolean riproducibileSiNo, int luminosit�) {
		super(titolo, riproducibileSiNo);
		this.Luminosit� = luminosit�;

	}

	public int getluminosit�() {
		return this.Luminosit�;
	}

	@Override
	public void aumentaLuminosit�() {
		this.Luminosit�++;
	}

	@Override
	public void abbassaLuminosit�() {
		this.Luminosit�--;
	}

	public void show() {
		String x = "";
		for (int i = 0; i > this.Luminosit�; i++) {
			x = "*" + x;
		}
	}

}