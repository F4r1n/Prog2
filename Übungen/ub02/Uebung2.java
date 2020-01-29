package ub02;

/**
 * Dateiname: Hallo.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 2 - Rechenoperationen
 * @since 15.10.2017
 * letzte Änderung: 23.10.2017
 */

public class Uebung2 {

	public static void main(String[] args) {
		//1
		System.out.println("Die Summe von 225 + 5 ergibt 230");
		//2
		System.out.print("Die Summe aus 225 und 5 ergibt ");
		System.out.println(225+5);
		//3
		System.out.print("225+5=");			//Addition
		System.out.println(225+5);
		System.out.print("225-5=");			//Subtraktion
		System.out.println(225-5);
		System.out.print("225*5=");			//Multiplikation
		System.out.println(225*5);
		System.out.print("225/5=");			//Division
		System.out.println(225/5);
		System.out.print("225%5=");			//Rest der Divison/Mod
		System.out.println(225%5);
		System.out.println();
		//4
		int alpha=225;
		int beta=5;						
		System.out.print(alpha +"+"+ beta+"=");			//Addition
		System.out.println(alpha+beta);
		System.out.print(alpha +"-"+ beta+"=");			//Subtraktion
		System.out.println(alpha-beta);
		System.out.print(alpha +"*"+ beta+"=");			//Multiplikation
		System.out.println(alpha*beta);
		System.out.print(alpha +"/"+ beta+"=");			//Division
		System.out.println(alpha/beta);
		System.out.print(alpha +"%"+ beta+"=");			//Rest der Divison/Mod
		System.out.println(alpha%beta);
		//5 - Ergebnisse werden an long angepasst statt integer
		long alpha1=20000000000L;
		System.out.print(alpha1 +"+"+ beta+"=");			//Addition
		System.out.println(alpha1+beta);
		System.out.print(alpha1 +"-"+ beta+"=");			//Subtraktion
		System.out.println(alpha1-beta);
		System.out.print(alpha1 +"*"+ beta+"=");			//Multiplikation
		System.out.println(alpha1*beta);
		System.out.print(alpha1 +"/"+ beta+"=");			//Division
		System.out.println(alpha1/beta);
		System.out.print(alpha1 +"%"+ beta+"=");			//Rest der Divison/Mod
		System.out.println(alpha%beta);
		//6 - da mit Integerwerten gearbeitet wird, werden Kommastelen bei Ergebnissen einfach abgeschnitten
		int beta1=7;						
		System.out.print(alpha +"+"+ beta+"=");			//Addition
		System.out.println(alpha+beta);
		System.out.print(alpha +"-"+ beta+"=");			//Subtraktion
		System.out.println(alpha-beta);
		System.out.print(alpha +"*"+ beta+"=");			//Multiplikation
		System.out.println(alpha*beta);
		System.out.print(alpha +"/"+ beta+"=");			//Division
		System.out.println(alpha/beta);
		System.out.print(alpha +"%"+ beta+"=");			//Rest der Divison/Mod
		System.out.println(alpha%beta);
		//7
		System.out.println();
		System.out.print(alpha +"/"+ beta1 + "=");
		System.out.println(alpha/beta1 +","+ ((alpha%beta1)*100)/beta1);
		
		//1b
		float zahl1=6.8f;
		float zahl2=2.8976f;
		double zahl3=1.987654329;
		short zahl4=-7890;
		float zahl5=-0.00007f;
		long zahl6=9000000000L;
		double zahl7=9000000000.008;
		double zahl8=1.000000000863;
		
		System.out.println(zahl1);
		System.out.println(zahl2);
		System.out.println(zahl3);
		System.out.println(zahl4);
		System.out.println(zahl5);
		System.out.println(zahl6);
		System.out.println(zahl7);
		System.out.println(zahl8);
		System.out.println();
		//2b
		System.out.println(4%2);
		System.out.println(2%2);
		System.out.println(1%2);
		System.out.println(0%2);
		System.out.println(897654%2);
		System.out.println(89%9);
		System.out.println(89%1);
		//System.out.println(89%0);
		System.out.println(89%100);
		System.out.println();
		//3b
		System.out.println(6/2);
		System.out.println(6/5);
		System.out.println(6/5.0);
		System.out.println(6.0/5);
		System.out.println(6.0/5.0);
		System.out.println(0.6/5);
		System.out.println(0/7);
		System.out.println(0/7.0);
		//System.out.println(0.7/0);
		
		
	}

}
