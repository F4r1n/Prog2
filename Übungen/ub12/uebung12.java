package ub12;

import java.util.Scanner;

public class uebung12 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Geben Sie eine Dezimalzahl an, die in eine römische Zahl umgewandelt werden soll:");		//Eingabeaufforderung
		int eingabe= scan.nextInt();
		String ausgabe=dezToRom(eingabe);																				//method call
		System.out.print(ausgabe);																						

	}//main end

	public static String dezToRom(int num) {
	    StringBuilder sb = new StringBuilder();
	    int times = 0;
	    String[] roemisch = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",										//Array roemische Zahlenwerte
	            "XC", "C", "CD", "D", "CM", "M" };
	    int[] dezimal = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,											//Array Dezimalzahlen - selbe Reihenfolge wie roem
	            900, 1000 };
	    
	    for (int i = dezimal.length - 1; i >= 0; i--) {																	//Wort von hinten durchlaufen
	        times = num / dezimal[i];
	        num %= dezimal[i];
	        while (times > 0) {
	            sb.append(roemisch[i]);																					//Anhängen der römischen Zahlwerte in Stringbuilder
	            times--;
	        }
	    }
	    return sb.toString();																							//return to main
	} //method end
}//class end
