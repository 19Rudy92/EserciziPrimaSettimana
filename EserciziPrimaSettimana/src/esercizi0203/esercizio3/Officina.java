package esercizi0203.esercizio3;

public class Officina {
	private double prezzoLav;
	private String[] macchineInRip;

	public Officina(double prezzoLav, String[] macchineInRip) {
		this.prezzoLav = prezzoLav;
		this.macchineInRip = macchineInRip;
	}

	public double getprezzoLav() {
		return prezzoLav;
	}

	public String[] getmaccInRip() {
		return macchineInRip;
	}

}
