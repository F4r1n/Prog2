package kalender;

import java.util.Scanner;
/**
 * Dateiname: Eingabe.java
 * @author Jonas Liebermann
 * @version	1.0
 * @since	14.04.2018
 * last changed on: 27.04.2018
 * java jre1.8.0
 * Enthält Evaluationen der Eingabe und die Eingabe selbst.
 */
public class Eingabe {

	Kalender meinKalender = new Kalender();
	Ausgabe ausgabe = new Ausgabe();
	String nachricht = "";

	/**
	 * Beschreibung: Methode die einen Wert einliest und dies Wiederholt bis die Eingabe gültig ist.
	 * 
	 * @return	gibt Eingabe-String als Integer Wert zurück zur Verarbeitung der EIngabe
	 */
	public int leseEin () {
		
		Scanner scan = new Scanner(System.in);
		String eingabe = "";
		
		do {
			eingabe= scan.next();
		} while (!istInt(eingabe));
		
		int intEingabe = Integer.parseInt(eingabe);
		return intEingabe;
	}
	/**
	 * Beschreibung: Methode die überprüft ob die Eingabe als ein Integerwert interpretiert werden kann.
	 * 
	 * @param eingabe 	der eingegebene String, der versucht wird in einen Integer Wert umzuwandeln
	 * @return			gibt boolean Wert zurück, der sagt ob Eingabe ein INteger Wert ist
	 */
	public boolean istInt (String eingabe) {
		
		boolean success = false;
		
		try {
			Integer.parseInt(eingabe);
			success = true;
		} catch (NumberFormatException e) {
			nachricht = "Ihre Eingabe konnte leider nicht als Zahl interpretiert werden. Bitte erneut versuchen.";
			ausgabe.fehlerAusgabe(nachricht);
		}
		return success;
	}
		
	/**
	 * Beschreibung: Methode, die die Eingabe für das Auswahlmenü evaluiert und entsprechend an andewre Methoden weiterleitet.
	 * 
	 * @param kalenderArt	Die Eingabe im Auswahlmenue die hier ausgewertet wird
	 * @return				gibt boolean Wert zurück, der sagt ob Eingabe erfolgreich
	 */
	public boolean artEvaluation(int kalenderArt) {

		boolean done = false;
		boolean success = false;
		int startTag = 0;
		
		if (kalenderArt > 3 || kalenderArt < 0) {
			nachricht = "Die Eingabe liegt nicht im gültigen Eingabebereich. Bitte versuchen Sie es erneut!";
			ausgabe.fehlerAusgabe(nachricht);
		} else if (kalenderArt == 0) {
			nachricht = "Auf Wiedersehen und Vielen Dank fuer das benutzen des Programms!";
			ausgabe.nachrichtenAusgabe(nachricht);
			done = true;
		} else if (kalenderArt == 1) {
			int jahr = meinKalender.liesJahr();
			meinKalender.zeigeJahr(jahr);
		} else if (kalenderArt == 2) {
			int jahr = meinKalender.liesJahr();
			int monat = meinKalender.liesMonat();
			meinKalender.zeigeMonat(jahr, monat);
		} else if (kalenderArt == 3) {
			nachricht = "Geben Sie bitte eine der Zahlen (0 oder 1) repraesentativ fuer den ersten Tag der Woche (Mo oder So) an.";
			ausgabe.nachrichtenAusgabe(nachricht);
			do {
				startTag = leseEin();
				success = startTagEvaluation(startTag);
			} while (!success);
			meinKalender.setStartTag(startTag);
		} 
		return done;
	}
	/**
	 * Beschreibung: Methode die überprüft ob die Eingabe für den Starttag (Sonntag oder Montag) des angeziegten Klenders gültig ist.
	 * 
	 * @param startTag	Der erste Tag der Woche der hier Evaluiert wird
	 * @return			gibt boolean Wert zurück, der sagt ob Eingabe erfolgreich
	 */
	public boolean startTagEvaluation (int startTag) {
		
		boolean done = false;
		
		if (startTag > 1 || startTag <0) {
			nachricht = "Die Eingabe liegt nicht im gültigen Eingabebereich. Bitte versuchen Sie es erneut!";
			ausgabe.fehlerAusgabe(nachricht);
		} else {
			done = true;
		}
		return done;
	}
	/**
	 * Beschreibung: Methode die überprüft, ob das eingegebene Jahr in einem gültigen Intervall liegt.
	 * 
	 * @param jahr		Das Jahr das auszugeben ist wird hier evaluiert
	 * @return			gibt boolean Wert zurück, der sagt ob Eingabe erfolgreich	
	 */
	public boolean jahrEvaluation(int jahr) {
		
		boolean done = false;
		
		if (jahr > 9999 || jahr <= 1582) {
			nachricht = "Die Eingabe liegt nicht im gültigen Eingabebereich. Bitte versuchen Sie es erneut!";
			ausgabe.fehlerAusgabe(nachricht);
		} else {
			done = true;
		} 
		return done;
	}
	/**
	 * Beschreibung: Methode, die überprüft ob die Eingabe des Monats zwischen 1 und 12 liegt. 
	 * 
	 * @param monat		Der Monat der angezeigt werden soll wird hier evaluiert
	 * @return 			gibt boolean Wert zurück, der sagt ob Eingabe erfolgreich
	 */
	public boolean monatEvaluation(int monat) {
		
		boolean done = false;
		
		if (monat > 12 || monat < 1) {
			nachricht = "Die Eingabe liegt nicht im gültigen Eingabebereich. Bitte versuchen Sie es erneut!";
			ausgabe.fehlerAusgabe(nachricht);
		} else {
			done = true;
		}
		return done;
	}
}