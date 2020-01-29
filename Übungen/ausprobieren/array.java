package ausprobieren;

public class array {

	public static void main(String[] args) {
		char [] [] feld;
		feld= new char[5][5];
		int i=0;
		int j=0;
		
		for (i=0;i<=4;i++) {
			for (j=0;j<=4;j++) {
				if (i==j) {
					feld [i] [j]= 'a';
					System.out.print(feld [i] [j]);
				}//end if
				else {
					feld [i] [j]='b';
					System.out.print(feld [i] [j]);
				}//else end
			}//endfor2
			System.out.println();
		}//end for1

	}//end main

}//end class