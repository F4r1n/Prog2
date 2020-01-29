package kalender;

import java.util.stream.IntStream;

/**
 * Dateiname: Kalender.java
 * 
 * @author Jonas Liebermann
 * @version 1.0
 * @since 14.04.2018 last changed on: 27.04.2018 java jre1.8.0 Enthält
 *        Dunktionalität des Klaenders. Berechnungen und Formatierungen der
 *        Kalenderblätter,
 */
public class Kalender implements IKalender {

	String nachricht = "";
	int startTag = 0;
	KalenderFunktion kalenderFunktion = new KalenderFunktion();
	final int[] EINUNDREISSIG = { 1, 3, 5, 7, 8, 10, 12 };

	public void setStartTag(int startTag) {
		this.startTag = startTag;
	}

	/**
	 * Beschreibung: Berechnet die Leerstellen der ersten WochenTage des Monats.
	 * Wenn der erste des Monats ein Mittwoch wäre würden Sonntag/Montag-Dienstag
	 * Leerstellen zugewiesen werden.
	 * 
	 * @param tagDerWoche
	 *            Wochentag aus Funktion "wochentag_im_jahr"
	 * @return Leerstellen im Kalender
	 */
	public int blanks(int tagDerWoche) {
		int leer = tagDerWoche;

		if (startTag == 1) {
			leer += 1;
		}
		if (leer < 0) {
			leer = 6;
		}
		return leer;
	}

	/**
	 * Beschreibung: Gibt die maximale Anzahl der Tage des Monats zurück (28/29, 30
	 * oder 31).
	 * 
	 * @param jahr
	 *            Das gewünschte Jahr
	 * @param monat
	 *            Der gewünschte Monat
	 * @return Tage des Monats (28,29,30,31)
	 */
	public int relativerTag(int jahr, int monat) {

		int relTag;

		if (monat == 2) {
			if (kalenderFunktion.istSchaltjahr(jahr)) {
				relTag = 29;
			} else {
				relTag = 28;
			}
		} else if (IntStream.of(EINUNDREISSIG).anyMatch(x -> x == monat)) {
			relTag = 31;
		} else {
			relTag = 30;
		}
		return relTag;
	}

	@Override
	public String getMonatsblatt(int jahr, int monat) {

		String kopfZeile = getKopfzeileMonatsblatt(jahr, monat);
		int relTag = relativerTag(jahr, monat);
		KalenderFunktion kalenderFunktion = new KalenderFunktion();
		int totalNumDays = 0;

		//Maximale Tage des Monats
		for (int i = 1; i < monat; i++) {
			totalNumDays += relativerTag(jahr, i);
		}

		int ersterTagMonat = kalenderFunktion.wochentag_im_jahr(jahr, totalNumDays + 1);
		int leerStellen = blanks(ersterTagMonat);
		String[] tage = new String[relTag + leerStellen - 1];

		//Leerstellen in das Feld einfügen für Tage des Vormonats.
		for (int i = 1; i < leerStellen; i++) {
			tage[i - 1] = "  \t";
		}

		//Tatsächliche Tage in ein Feld einfügen.
		for (int i = 1; i <= relTag + leerStellen - 1; i++) {
			if (tage[i - 1] != "  \t") {
				tage[i - 1] = (i - leerStellen + 1) + "\t";
			}
		}

		String tagString = "";

		//Auffüllen des Strings mit tatsächlichen Tagen und den Zeilenumrüchen.
		for (int i = 0; i < tage.length; i++) {
			if ((i) % 7 == 0) {
				tagString += "\n";
			}
			tagString += tage[i];
		}

		return kopfZeile + tagString + "\n";
	}

	@Override
	public String getKopfzeileMonatsblatt(int jahr, int monat) {
		String ausgabeString = "";

		switch (monat) {
		case 1:
			ausgabeString = "=======================Januar " + jahr + "==================\n";
			break;
		case 2:
			ausgabeString = "=======================Februar " + jahr + "=================\n";
			break;
		case 3:
			ausgabeString = "========================Maerz " + jahr + "==================\n";
			break;
		case 4:
			ausgabeString = "========================April " + jahr + "==================\n";
			break;
		case 5:
			ausgabeString = "=========================Mai " + jahr + "===================\n";
			break;
		case 6:
			ausgabeString = "========================Juni " + jahr + "===================\n";
			break;
		case 7:
			ausgabeString = "========================Juli " + jahr + "===================\n";
			break;
		case 8:
			ausgabeString = "=======================August " + jahr + "==================\n";
			break;
		case 9:
			ausgabeString = "======================September " + jahr + "================\n";
			break;
		case 10:
			ausgabeString = "=======================Oktober " + jahr + "=================\n";
			break;
		case 11:
			ausgabeString = "=======================November " + jahr + "================\n";
			break;
		case 12:
			ausgabeString = "=======================Dezember " + jahr + "================\n";
			break;
		}

		switch (startTag) {
		case 0:
			ausgabeString += "MO\tDI\tMI\tDO\tFR\tSA\tSO";
			break;
		case 1:
			ausgabeString += "SO\tMO\tDI\tMI\tDO\tFR\tSA";
			break;
		}

		return ausgabeString;
	}

	@Override
	public void zeigeMonat(int jahr, int monat) {
		(new Ausgabe()).nachrichtenAusgabe(getMonatsblatt(jahr, monat));
	}

	@Override
	public void zeigeJahr(int jahr) {

		for (int monat = 1; monat <= 12; monat++) {
			zeigeMonat(jahr, monat);
		}

	}

	@Override
	public int liesMonat() {

		boolean done = false;
		int monat = 0;
		Ausgabe ausgabe = new Ausgabe();
		Eingabe eingabe = new Eingabe();

		nachricht = "Geben Sie bitte den Monat ein (1-12): ";
		ausgabe.nachrichtenAusgabe(nachricht);

		do {
			monat = eingabe.leseEin();
			done = eingabe.monatEvaluation(monat);
		} while (!done);

		return monat;
	}

	@Override
	public int liesJahr() {

		boolean done = false;
		int jahr = 0;
		Ausgabe ausgabe = new Ausgabe();
		Eingabe eingabe = new Eingabe();

		nachricht = "Geben Sie bitte das Jahr ein (1582-9999): ";
		ausgabe.nachrichtenAusgabe(nachricht);

		do {
			jahr = eingabe.leseEin();
			done = eingabe.jahrEvaluation(jahr);
		} while (!done);
		return jahr;
	}

	@Override
	public void auswahlMenue() {
		(new Ausgabe()).eingabeAufforderung();
	}

}
