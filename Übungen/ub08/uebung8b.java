package ub08;
/**
 * Dateiname: uebung8b.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 8b: Turtle mit Paramentern
 * @since 15.10.2017
 * letzte Änderung: 17.11.2017
 */
import java.awt.Color;
import ch.aplu.turtle.Turtle;
import ch.aplu.util.Console;

public class uebung8b {

	public static void main(String[] args) {
		String richtung; 				// l = links, r = rechts
		double steps = 0, 				// Vergroesserungsabstand
		loops = 0; 						// Anzahl der Windungen (also einmal herum um 360 Grad)
		int counter=0; 					// Zaehler für die Windungen
		Turtle john=new Turtle();
		Color [] farbe = { Color.RED,
				   Color.BLACK,
				   Color.GREEN,
				   Color.BLUE,
		};
		int farbindex=0;
		double entfernung=20;
		
		Console.init();
		john.setX(0);
		john.setY(0);
		john.left(180);
		System.out.print("In welche Richtung soll die Körte laufen (l=links, r=rechts)\n");
		richtung= Console.readLine();
		System.out.print("\nWieviele Windungen?\n");
		loops=Console.readDouble();
		System.out.print("\nVergroesserungsabstand?\n");
		steps=Console.readDouble();
		
		for(counter = 0; counter < (loops*4); counter++){
			if (counter%4==0) {
			double x = john.getX();
			double y = john.getY();
			john.setFontSize(12);
			john.label("x=" + (int)x + "/ y="+ (int)y);
			}
			john.setColor(farbe[farbindex]);
			john.setPenColor(farbe[farbindex]);
			farbindex++;
			if (farbindex==farbe.length) {
				farbindex=0;
			}//if end
			if (richtung.equals("l")) {
				john.left(90.0);
			}//if end
			else {
				john.right(90);
			}//else end
			john.forward(entfernung);
			entfernung=entfernung+steps;
		}//for end
	}

}
