package provaSettimana2;

public class Immagine extends ElementoMultimediale {
	private int Luminosità;

	public Immagine(String titolo, boolean riproducibileSiNo, int luminosità) {
		super(titolo, riproducibileSiNo);
		this.Luminosità = luminosità;

	}

	public int getluminosità() {
		return this.Luminosità;
	}

	@Override
	public void aumentaLuminosità() {
		this.Luminosità++;
	}

	@Override
	public void abbassaLuminosità() {
		this.Luminosità--;
	}

	public void show() {
		String x = "";
		for (int i = 0; i > this.Luminosità; i++) {
			x = "*" + x;
		}
	}

}