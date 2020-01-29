package kalender;
/** 
 * Beschreibung: Algorithmen fuer Kalenderfunktionen. Insbesondere Schaltjahrregel, Tagesnummer
 * Diese Algorithmen sind zusammengetragen aus verschiedenen Quellen.
 * 
 * Bitte veraendern Sie diese Datei nicht! 
 * Falls Sie zusaetzliche Funktionen benoetigen, legen Sie eine eigene java-Datei an!
 * @author bannert
 */
public class KalenderFunktion
{
/**
 =========================================================================
 * Funktion:    istSchaltjahr( int jahr )
 * Parameter:    jahr (int)    : das Jahr, das auf Schaltjahr ueberprueft wird
 * Rueckgabe:    (boolean)     : true, wenn das Jahr ein Schaltjahr ist
 *                             : false,  wenn das Jahr nicht Schaltjahr ist
 * Beschreibung: jedes 4.te Jahr ist Schaltjahr,
 * (wenn sich das Jahr durch 4 ohne Rest teilen laesst, ist es Schaltjahr )
 * Ausnahme davon jedes 100.te Jahr ist kein Schaltjahr
 * (wenn sich das Jahr durch 100 ohne Rest teilen laesst, ist es kein Schaltjahr)
 * Ausnahme davon jedes 400.ter Jahr    ist wieder Schaltjahr
 * (wenn sich das Jahr durch 400 ohne Rest teilen laesst, ist es Schaltjahr)
 * =========================================================================
 */
 boolean istSchaltjahr(int jahr)
 {
    return ((jahr%4 == 0 )&&((jahr%100 != 0 )||( jahr%400 == 0 )));
 }

/**
 =========================================================================
 * Funktion:    schaltjahr(int jahr)
 * Parameter:    jahr (int) : das Jahr, das auf Schaltjahr ueberprueft wird
 * Rueckgabe:    (int)      :     1 = true, wenn das Jahr ein Schaltjahr ist
 *                          :     0 = false,  wenn das Jahr nicht Schaltjahr ist
 * Beschreibung: siehe --> istSchaltjahr(long jahr)
 * =========================================================================
 */
 int schaltjahr(int jahr)
 {
    if(istSchaltjahr(jahr)) return 1;
    else return 0;
 }

/**
 =========================================================================
 * Funktion:    tagesnummer(int tag, int monat, int jahr)
 * Parameter:    tag (long)       : Tag
 *               monat (long)     : Monat
 *               jahr (long)      : Jahr
 * Rueckgabe:    n (int)         : Tagesnummer rel. zum Jahresanfang
 *                               (1=1.1.,2=2.1.,...365/366=31.12)
 * Beschreibung: Algorithmus von Robertson
 * =========================================================================
 */
 int tagesnummer(int tag, int monat, int jahr)
 {
   int d, e;
   d = (monat+10)/13;
   e = tag + (611*(monat+2))/20 - 2*d - 91;
   return (e + schaltjahr (jahr) * d );
 }

/**
 =========================================================================
 * Funktion:    wochentag_im_jahr(int jahr, int n)
 * Parameter:    jahr (long)    : Jahr
 *                n (int)       : Tagesnummer rel. zum Jahresanfang
 *                              (1=1.1.,2=2.1.,...365/366=31.12)
 * Rueckgabe:    (int) : Wochentag (0=So, 1=Mo,..., 6=Sa)
 * Beschreibung: Algorithmus von Zeller
 * =========================================================================
 */
 int wochentag_im_jahr(int jahr, int n)
 {
   int j, c;
   j = (jahr-1) % 100;
   c = (jahr-1) / 100;
   return (28+j+n+(j/4)+(c/4)+5*c) % 7;
 }
} // end of class