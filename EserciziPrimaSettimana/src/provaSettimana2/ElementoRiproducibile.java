package provaSettimana2;

public abstract class ElementoRiproducibile {
	private String Titolo;
	private boolean RiproducibileSiNo;

	public ElementoRiproducibile(String titolo, boolean riproducibileSiNo) {
		super();
		this.Titolo = titolo;
		this.RiproducibileSiNo = riproducibileSiNo;
	}

	public void alzaVolume1() {
	}

	public void abbassaVolume1() {
	}

	public void aumentaLuminosità1() {
	}

	public void abbassaLuminosità1() {
	}

	public void alzaVolume() {
	}

	public void abbassaVolume() {
	}

}