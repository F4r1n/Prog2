package ub03;
/**
 * Dateiname: Uebung3.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 3 - Fahrenheit/Celsius Umrechnung
 * @since 15.10.2017
 * letzte Änderung: 29.10.2017
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uebung3 {
	public static void main(String [] args) {
		int min=0;
		int max=100;
		int schritt=10;
	//Aufgabe 1
		String pattern="###,##0.00";	//format für ErgebnisAusgabe
		DecimalFormat form = new DecimalFormat(pattern);
		System.out.printf("\nBeginn:%d F Ende:%d F Schrittweite:%d",min,max,schritt);
		for (min=0;min<=max;) {
			float celsius=(float) (min-32)*5/9;			//Umrechnung
			System.out.printf("\n%dF \t "+ form.format(celsius)+"C",min);
			min=min+schritt;
		} //for end
		
	//Erweiterung 1	
		int celsiusMax=100;
		int schrittB=10;
		int celsiusNeu=0;
		
		System.out.printf("\n\nBeginn:%d F Ende:%d F Schrittweite:%d",celsiusNeu,celsiusMax,schrittB);
		for (celsiusNeu=0;celsiusNeu<=celsiusMax;) {
			double fahrenheit= (int) celsiusNeu*1.8 +32;	//double, da Multiplikation mit 1.8 und Typen sonst unverträglich 	Umrechnung
			System.out.printf("\n%dC "+ form.format(fahrenheit)+"F",celsiusNeu);
			celsiusNeu=celsiusNeu+schrittB;				
		} //for end
		
	//Erweiterung 2
		int start=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\nBitte Minimalwert eingeben: ");
		celsiusNeu=scan.nextInt();
		System.out.print("\nBitte Maximalwert eingeben: ");
		celsiusMax=scan.nextInt();
		System.out.print("\nBitte Schrittweite eingeben: ");
		schrittB=scan.nextInt();
		
		System.out.printf("\n\nBeginn:%d C Ende:%d C Schrittweite:%d",celsiusNeu,celsiusMax,schrittB);
		for (start=celsiusNeu;celsiusNeu<=celsiusMax;) {
			double fahrenheit= (int) celsiusNeu*1.8 +32;	//double, da Multiplikation mit 1.8 und Typen sonst unverträglich		Umrechnung
			System.out.printf("\n%dC "+ form.format(fahrenheit)+"F",celsiusNeu);
			celsiusNeu=celsiusNeu+schrittB;				
		} //for end
	} //main end

} //class end
