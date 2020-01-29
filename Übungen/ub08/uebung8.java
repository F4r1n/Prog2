package ub08;
/**
 * Dateiname: uebung8.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 8a: Turtle John
 * @since 15.10.2017
 * letzte Änderung: 17.11.2017
 */
import java.awt.Color;
import ch.aplu.turtle.Turtle;

public class uebung8 {

	public static void main(String[] args) {
		Turtle john=new Turtle();
		int walk=10;
		int farbindex=0;
		Color [] farbe = { Color.RED,
						   Color.BLACK,
						   Color.GREEN,
						   Color.BLUE,
		};
		
		john.setX(0);
		john.setY(0);
		john.left(180);
		for(int i = 0; i < (3*4); i++){
			double x = john.getX();
			double y = john.getY();
			john.setFontSize(12);
			john.label("x=" + (int)x + "/ y="+ (int)y);
			john.setPenColor(farbe[farbindex]);
			farbindex++;
			if (farbindex==farbe.length) {
				farbindex=0;
			}//if end
			john.left(90.0);
			john.forward(walk);
			walk=walk+30;
		}//for end

	}//main end

}//class end
