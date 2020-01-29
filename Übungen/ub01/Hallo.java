package ub01;
	/**
	 * Dateiname: Hallo.java
	 * @author Jonas Liebermann
	 * E-Mail: s0563579@htw-berlin.de
	 * @version eclpise Oxygen, JavaSE-1.8
	 * Beschreibung: Uebung 1 - Ausgabe und Sonderzeichen
	 * @since 15.10.2017
	 * letzte Änderung: 15.10.2017
	 */
public class Hallo {

	public static void main(String[] args) {
		//Aufgabe 1
			System.out.println("Hallo Welt");
		// Aufgabe 2
			System.out.println("Jonas Liebermann");
		// Aufgabe 3
			System.out.println("Mein erstes Programm");
			System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
			System.out.println("Jonas Liebermann, ich bin 18 Jahre alt");
		// Aufgabe 4 - print gibt im Gegensatz zu println die Zeilen ohne Umbrüche aus
			System.out.print("Mein erstes Programm");
			System.out.print("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
			System.out.print("Jonas Liebermann, ich bin 18 Jahre alt");
		// Aufgabe 5
			System.out.print("\nund tschuess"); // Erläuterung : \n initialisiert eine neue Zeile in der Ausgabe, wirkt also wie ein Zeilenumbruch
			System.out.print("und\ntschuess");
			System.out.print("und tschuess\n");
		// Aufgabe 6 - die erste und dritte Zeile Code
			System.out.println("und tschuess");
			System.out.println("und tschuess");
		// Aufgabe 7
			System.out.println("Donald sagte:\"Trick bekommt 1/2 - die anderen den Rest\" \t \"Trick\" & \"Track\" holen sich die Hälfte \\ und gehen \\ nach Hause.");
		// Aufgabe 8 - "Hallo Welt" mit Hilfe des Unicodes basierend auf den Hexadezimalwerten der Buchstaben im Ascii-Code
			System.out.println("\u0048\u0061\u006c\u006c\u006f\u0020\u0057\u0065\u006c\u0074");
		// Aufgabe 9
			System.out.println("\t\t  X ");
			System.out.println("\t\t XXX");
			System.out.println("\t\t XXXXX");
			System.out.println("\t\tXXXXXX");
			System.out.println("\t\t XXXX");
			System.out.println("\t\tXXXXXXXXX");
			System.out.println("\t       XXXXXXXXXXX \t HAPPY");
			System.out.println("\t       /////\\\\\\\\\\ \t HALLOWEEN");
			System.out.println("\t      /// O   O \\\\");
			System.out.println("\t        /// U \\\\\\");
			System.out.println("\t       // \\___/ \\\\ \t/\\   /\\");
			System.out.println("\t\t a\ta\t| O O |");
			System.out.println("\t\taaaaaaaaaaa\t:::@:::");
			System.out.println("\t\taaaa aaa aaab   \\/  \\/");
			System.out.println("\t\taaaa\taaa\t|     |");
			System.out.println("\t\taaaaaaaaaaa\tV----V");
			
			
	}

}
