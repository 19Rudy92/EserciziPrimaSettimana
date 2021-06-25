package esercizioRettangolo;

public class Start {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(19, 16); // istanzio a1
		Rettangolo r2 = new Rettangolo(12, 9); // istanzio a2
		stampaDueRettangoli(r1, r2);

	}

	public static void stampaDueRettangoli(Rettangolo a1, Rettangolo a2) {
		double perimetro1 = a1.perimetro();
		double area1 = a1.area();
		double perimetro2 = a2.perimetro();
		double area2 = a2.area();
		System.out.println("Il perimetro di r1 è " + perimetro1); 	//stampo il perimetro di r1
		System.out.println("L area di r1 è " + area1); 	//stampo l area di r1
		System.out.println("il perimetro di r2 è" + perimetro2);
		System.out.println("L area di r2 è " + area2);
		System.out.println("La somma dei due perimetri è " + (perimetro1 + perimetro2)); 	//sommo i perimetri di r1 e r2
		System.out.println("La somma delle aree è " + (area1 + area2)); 	//sommo le 2 aree

	}
}
