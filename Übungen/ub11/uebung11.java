package ub11;

import java.util.*;

public class uebung11 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean weiter=true;
		
		
		do {
		System.out.println("Geben Sie einen String zur Überprüfung ein: ");
		String eingabe=scan.nextLine();
		
		palin(eingabe);
		
		System.out.println("Wollen Sie ein weiteres Wort prüfen? (j/n)");
		String wdh=scan.nextLine();
		if (wdh.equals("n")) {
			weiter=false;
		}
		} while(weiter==true);
	}//main end

	public static void palin(String eingabe) {
		String objekt="";
		
		eingabe=eingabe.toLowerCase();
		eingabe=eingabe.replaceAll("\\s", "");
		int lang=eingabe.length();
		
		for (int i=lang-1;i>=0;i--) {
			objekt= objekt + eingabe.charAt(i);
		}//for end
		System.out.println("Umgedreht sieht das Wort so aus: " + objekt);
		
		if (eingabe.equals(objekt)) {
			System.out.println("Bei "+eingabe+" handelt es sich um ein Palindrom.");
		}//if end
		else {
			System.out.println("Bei "+eingabe+" handelt es sich um kein Palindrom.");
		}//else end
	}//palin end
}//class end
