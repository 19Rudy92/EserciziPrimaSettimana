package provaSettimana2;

public class Video extends ElementoRiproducibile {
	private int Luminosità;
	private int Durata;
	private int Volume;

	public Video(String titolo, boolean riproducibileSiNo, int luminosità, int durata, int volume) {
		super(titolo, riproducibileSiNo);
		this.Luminosità = luminosità;
		this.Durata = durata;
	}

	public int getluminosità() {
		return this.Luminosità;
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
	public void aumentaLuminosità1() {
		this.Luminosità++;
	}

	@Override
	public void abbassaLuminosità1() {
		this.Luminosità--;
	}

}