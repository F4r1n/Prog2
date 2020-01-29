package ub10;

import java.util.Scanner;

public class uebung10 {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
		
		ausgabe(32, 127);
		System.out.println("\n");
		ausgabe(128, 255);
		System.out.println("\n");
//		unicodeAusg();
//		System.out.println("\n");
		
		//unicodeTabelle(32,127);
		
	}//main end

public static void ausgabe (int min, int max) {
	for (int i=min;i<=max;i++) {
		System.out.print((char)i + "\t" + "("+i+")");
		
		if (i==32) {		
		}//if end
		else if (i%16==0) {
			System.out.println();
		}//else if end
	}//for end
		
}//ausgabe end

public static void unicodeAusg () {
	String [] feld= {"\u0033","\u0042","\u0067","\u00c4","\u00d6","\u00dc","\u00e4","\u00f6","\u00fc","\u00df", "\u00a9",}; 
	for (int i=0; i<feld.length; i++) {
		System.out.println(feld[i]);
	}//for end
}//unicodeAusg end

//public static void unicodeTabelle (int min, int max) {
//	for (int i=min;i<=max;i++) {
//		if (i < 0x10) {
//	           "\\u000" + Integer.toHexString(i);
//	      } else if (i < 0x100) {
//	           "\\u00" + Integer.toHexString(i);
//	      } else if (i < 0x1000) {
//	           "\\u0" + Integer.toHexString(i);
//	      }
//	       "\\u" + Integer.toHexString(i);
//		}//else if end
//	}//for end
}//class end


