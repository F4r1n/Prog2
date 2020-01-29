package kalender;
/**
 * Dateiname: Ausgabe.java
 * @author Jonas Liebermann
 * @version	1.0
 * @since	14.04.2018
 * last changed on: 27.04.2018
 * java jre1.8.0
 * Enthält alle Ausgaben des Programms.
 */
public class Ausgabe {
	
	public void eingabeAufforderung() {
		Eingabe eingabe = new Eingabe();
		boolean done = false;
		
		do {
			System.out.println("Auswahl:\t [1] Kalender fuer das ganze Jahr");
			System.out.println("Auswahl:\t [2] Ausgabe Monatsblatt");
			System.out.println("Auswahl:\t [3] StartTag festlegen");
			System.out.println("Auswahl:\t [0] Ende des Programms");
			done = eingabe.artEvaluation(eingabe.leseEin());
		} while (!done);
	}

	public void nachrichtenAusgabe(String nachricht) {
		System.out.println(nachricht);
	}
	
	public void fehlerAusgabe(String nachricht) {
		System.err.println(nachricht);
	}

}
