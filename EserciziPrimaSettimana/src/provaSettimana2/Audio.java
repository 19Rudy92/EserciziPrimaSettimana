package provaSettimana2;

public class Audio extends ElementoRiproducibile {
	private int Volume;

	public Audio(String titolo, boolean riproducibileSiNo, int volume) {
		super(titolo, riproducibileSiNo);
		this.Volume = volume;
	}

	public int getvolume() {
		return this.Volume;
	}

	@Override
	public void alzaVolume() {
		this.Volume++;
	}

	@Override
	public void abbassaVolume() {
		this.Volume--;
	}

}