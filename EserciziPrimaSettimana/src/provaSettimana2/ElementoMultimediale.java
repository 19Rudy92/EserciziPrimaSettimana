package provaSettimana2;

public abstract class ElementoMultimediale {
	private String Titolo;
	private boolean RiproducibileSiNo;

	public ElementoMultimediale(String titolo, boolean riproducibileSiNo) {
		super();
		this.Titolo = titolo;
		this.RiproducibileSiNo = riproducibileSiNo;
	}

	public void aumentaLuminosità() {
	}

	public void abbassaLuminosità() {
	}

}