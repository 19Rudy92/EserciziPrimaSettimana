package EsercizioMartedi22;

public class Dipendente {
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	private double oreStraordinario;

	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.dipartimento = dipartimento;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}

	public Dipendente(String matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario,Livello liv) {
		//this.matricola = matricola;
		//this.dipartimento = dipartimento;
		this(matricola,  dipartimento);
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = liv;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	public double getOreStraordinario() {
		return oreStraordinario;
	}
	public void setOreStraordinario(double ore) {
		this.oreStraordinario = ore;
	}

	public void setimportoOrarioStraordinario(double nuovoImporto) {
		this.importoOrarioStraordinario = nuovoImporto;
	}

	public void setDipartimento(Dipartimento dipart) {
		this.dipartimento = dipart;
	}

	public void stampaDatiDipendente() {
		System.out.println("Dipendente matricola: " + matricola);
		System.out.println("Del dipartimento: " + dipartimento);
		System.out.println("Qualificato come: " + livello);
		System.out.println("Stipendio base " + stipendio);
		System.out.println("Straordinario l ora " + importoOrarioStraordinario + "euro");

	}

	public Livello promozioneDipendente() {
		if (livello == Livello.OPERAIO) {
			livello = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
		} else if (livello == Livello.IMPIEGATO) {
			livello = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
		} else if (livello == Livello.QUADRO) {
			livello = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
		}
		else if (livello == Livello.DIRIGENTE) {
			System.out.println("Non è possibile promuore un DIRIGENTE");
		}
		return livello;

	}
	public double calcolaStipendioTotale() {
		return stipendio + oreStraordinario * importoOrarioStraordinario;
		
	}
	public double calcolaStipendioTotale(double oreStraord) {
		return stipendio + oreStraord * importoOrarioStraordinario;
		
	}
	
//		if (livello.equals(Livello.OPERAIO)) {
//			this.stipendio = stipendioBase;
//		}
//		else if (livello.equals(Livello.IMPIEGATO)) {
//			this.stipendio = stipendioBase * 1.2;
//		}
//		else if (livello.equals(Livello.QUADRO)) {
//			this.stipendio = stipendioBase * 1.5;
//		}
//		else if (livello.equals(Livello.DIRIGENTE)) {
//			this.stipendio = stipendioBase * 2;
//		}
//		return stipendio;
//	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}

	public static double calcolaPaga(Dipendente dipendente, double oreStraordinarie) {
		return dipendente.getStipendio() + (oreStraordinarie * dipendente.importoOrarioStraordinario);
	}
	
}
