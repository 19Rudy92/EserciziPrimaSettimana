package provaSettimana2;

public class Video extends ElementoRiproducibile {
	private int Luminosit�;
	private int Durata;
	private int Volume;

	public Video(String titolo, boolean riproducibileSiNo, int luminosit�, int durata, int volume) {
		super(titolo, riproducibileSiNo);
		this.Luminosit� = luminosit�;
		this.Durata = durata;
	}

	public int getluminosit�() {
		return this.Luminosit�;
	}

	public int getdurata() {
		return this.Durata;
	}

	@Override
	public void alzaVolume1() {
		this.Volume++;
	}

	@Override
	public void abbassaVolume1() {
		this.Volume--;
	}

	@Override
	public void aumentaLuminosit�1() {
		this.Luminosit�++;
	}

	@Override
	public void abbassaLuminosit�1() {
		this.Luminosit�--;
	}

}