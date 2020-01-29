package ub07;
/**
 * Dateiname: Uebung7.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 7: Liste der Agenten
 * @since 15.10.2017
 * letzte Änderung: 14.11.2017
 */
public class uebung07 {

	public static void main(String[] args) {
		String agent=new String ("Agent");
		Integer i=0;
		
		for (i=1;i<=999;i++) {
			System.out.printf("\n"+agent+ "%03d",i);
			if ((agent+i).equals("Agent7")) {
				System.out.print("\tJames Bond");
			}//end if
			if(i%4==0) {
				System.out.print("\tenttarnt");
			}//end if
		}//end for
		//Erweiterung umgekehrte Reihenfolge
		for (i=999;i>=1;i--) {
			System.out.printf("\n"+agent+ "%03d",i);
			if ((agent+i).equals("Agent7")) {
				System.out.print("\tJames Bond");
			}//end if
			if(i%4==0) {
				System.out.print("\tenttarnt");
			}//end if
		}//end for	
	}//end main

}//end class
