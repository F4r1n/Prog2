
public class kalenderKlasse {
	
	public void ausgabe() {
		int startTag=0;
		
		for (int monat=1;monat<13;monat++) {
			System.out.println(kalender(monat,startTag));
		}
	}
	
	
	public String kalender(int monat, int startTag) {
		String ausgabeString="";
		
		switch (monat) {
			case 1: ausgabeString  = "=======================Januar==================\n";
					break;
			case 2: ausgabeString  = "=======================Februar=================\n";
					break;
			case 3: ausgabeString  = "========================Maerz==================\n";
					break;
			case 4: ausgabeString  = "========================April==================\n";
					break;
			case 5: ausgabeString  = "=========================Mai===================\n";
					break;
			case 6: ausgabeString  = "========================Juni===================\n";
					break;
			case 7: ausgabeString  = "========================Juli===================\n";
					break;
			case 8: ausgabeString  = "=======================August==================\n";
					break;
			case 9: ausgabeString  = "======================September================\n";
					break;
			case 10: ausgabeString = "=======================Oktober=================\n";
					break;
			case 11: ausgabeString = "=======================November================\n";
					break;
			case 12: ausgabeString = "=======================Dezember================\n";
					break;
		}
		
		switch (startTag) {
			case 0: ausgabeString += "MO\tDI\tMI\tDO\tFR\tSA\tSO\n";
					break;
			case 1: ausgabeString += "DI\tMI\tDO\tFR\tSA\tSO\tMO\n";
					break;
			case 2: ausgabeString += "MI\tDO\tFR\tSA\tSO\tMO\tDI\n";
					break;
			case 3: ausgabeString += "DO\tFR\tSA\tSO\tMO\tDI\tMI\n";
					break;
			case 4: ausgabeString += "FR\tSA\tSO\tMO\tDI\tMI\tDO\n";
					break;
			case 5: ausgabeString += "SA\tSO\tMO\tDI\tMI\tDO\tFR\n";
					break;
			case 6: ausgabeString += "SO\tMO\tDI\tMI\tDO\tFR\tSA\n";
					break;
		}
		
		
		return ausgabeString;
	}
}
