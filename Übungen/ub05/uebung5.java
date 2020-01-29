package ub05;

import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class uebung5 {

	public static void main(String[] args) {
		int i=0;
		int w=0;
		int eingabe=0;
		
		Scanner scan = new Scanner(System.in);
		do {
		int munze = new Random().nextInt(100) + 1;
		System.out.println("Geben Sie an ob Kopf oder Zahl geworfen wird.'1' für Kopf. '2' für Zahl. Geben Sie '9' ein um das Spiel zu beenden!");
		eingabe= scan.nextInt();
		if (munze%2==0) {
			if (eingabe==1) {
				System.out.println("Glückwunsch! Sie haben gewonnen.");
				i=i+1;
				w=w+1;
			}//inneres if end
			else if (eingabe==2){
				System.out.println("Sie haben leider verloren.");
				i=i+1;
			}//else end
		}//if end
		else if (munze%2!=0) {
			if (eingabe==2) {
				System.out.println("Glückwunsch! Sie haben gewonnen.");
				i=i+1;
				w=w+1;
			}//inneres if end
			else if (eingabe==1){
				System.out.println("Sie haben leider verloren.");
				i=i+1;
			}//else end
		}//else if end
		else if (eingabe==9) {
			eingabe=9;
		}//else if end
		} while (eingabe!=9);// do end
						
		System.out.printf("Sie haben %d Spiele gespielt und davon %d gewonnen!",i,w);
	}//main end

}//class end
