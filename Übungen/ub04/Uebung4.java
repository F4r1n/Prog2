package ub04;
/**
 * Dateiname: Uebung4.java
 * @author Jonas Liebermann
 * E-Mail: s0563579@htw-berlin.de
 * @version eclpise Oxygen, JavaSE-1.8
 * Beschreibung: Uebung 4 - Schleifen
 * @since 15.10.2017
 * letzte Änderung: 03.11.2017
 */
import java.util.Scanner;

public class Uebung4 {

	public static void main(String[] args) {
		int umbruch=10;
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Nach der wievielten Zahl soll ein Zeilenumbruch stattfinden?");
		umbruch=scan.nextInt();
		for (i=1;i<=100;i++) {
			if (i%umbruch==0) {
				System.out.printf("\t%d \n",i);
			}//if end
			else {
				System.out.printf("\t%d ",i);
			}//else end		
		}//for end
		
		System.out.print("\n\n");
		i=1;
		while(i<=100) {
			if (i%umbruch==0) {
				System.out.printf("\t%d \n",i);
			}//if end
			else {
				System.out.printf("\t%d ",i);
			}//else end
			i++;
		}//while end
		
		System.out.print("\n\n");
		i=1;
		do {
			if (i%umbruch==0) {
				System.out.printf("\t%d \n",i);
			}//if end
			else {
				System.out.printf("\t%d ",i);
			}//else end
			i++;
		} while(i<=100);		//while/do end
		
		
		//Aufgabe 3: for(int i=10;i==10;){System.out.println(i)};	while(int i<10){i=5;System.out.print(i)};	for(int i=0;;i++){System.out.print(i)};
		
		short zahl=0;
		int quadrat=0;	//200² überschreitet die Grenze von Short mit 32.767 und muss deswegen zu integer geändert werden
		
		System.out.print("\n\n");
		System.out.print("x \t x²");
		for (zahl=100;zahl<=200;zahl++) {
			quadrat= zahl*zahl;
			System.out.printf("\n%d \t %d",zahl,quadrat);
		} //for end
	}//main end

}//void end
