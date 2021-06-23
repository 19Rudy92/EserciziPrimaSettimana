package Esercizio1Lun21;

public class Es1 {

	

	public static void main(String[] args) {
		
		int m = 2900;
		boolean p = bisestile1(m);
		if (p == true) {
			System.out.println("L anno 2900 è bisestile");
		} else {
			System.out.println("L anno 2900 non è bisestile");

		}
		int n = 1900; // do il valore ad int n
		boolean r = bisestile(n); // richiamo il metodo bisestile su n
		if (r == true) { // se r == vero
			System.out.println("L anno 1900 è bisestile "); // mi stampi che l anno è bisestile

		} else {
			System.out.println("L anno 1900 non è bisestile"); // senno mi stampi che non lo è
		}
		String str = "Ciao Riccardo"; // do valore alla stringa str (ciao riccardo
		boolean result = isEven(str); // richiamo il metodo isEven su str
		if (result == true) { //
			System.out.println("La lunghezza della stringa è pari ");
		} else {
			System.out.println("La lunghezza della stringa è dispari ");
		}

	}
		public static boolean isEven(String s) { // metodo boolean fuori dal main(come tutti i metodi) e lavora su (string
		// s)
			int le = s.length(); // lunghezza stringa
			if (le % 2 == 0) { // metodo stringa s pari o dispari
				return true;
			} else {
				return false;
			}

		}

		public static boolean bisestile1(int m) {
			if (m % 400 == 0) {
				return true;
			} else if (m % 4 == 0 && m % 400 != 0) {
				return true;
			} else {
				return false;
			}

		}

		public static boolean bisestile(int n) { // il metodo va a lavorare su (int n)
			if (n % 400 == 0) {
				return true;
			} else if (n % 4 == 0 && n % 100 != 0) {
				return true;
			} 
			else {
				return false;
			}
		}
		
	}
