/**
 * Es soll eine Klasse erstellt werden, die eine Tanksäule einer Selbstbedienungs-Tankstelle
 * modelliert. Die Klasse soll Dienstleistungen definieren, die man für den Betrieb einer
 * solchen Tanksäule benötigt. Es soll möglich sein, an dieser Säule zu tanken. Dazu muss
 * der Anwender vorher den hierfür benötigten Geldbetrag einwerfen können. Die Tanksäule
 * soll die Art des verkauften Kraftstoffs und dessen Preis kennen. Der Preis soll änderbar
 * sein. Die Tankstelle soll über die insgesamt verkaufte Kraftstoffmenge und den dafür
 * eingenommenen Betrag Buch führen.
 * 
 * @author (Jan-René Grünhagen) 
 * @version (2015.11.05)
 */
public class Tanksaeule
{
    private int preisProLiter; // Der Preis pro Liter Kraftstoff
    private int getankteLiter; // Die Anzahl der getankten Liter für das eingeworfene Geld (geldBisherBezahlt)
    private int getankteLiterGesamt; // Die gesamten ausgegebenen Liter 
    private int betragGesamt; // Der gesamte eingenommene Betrag
    private int geldBisherBezahlt; // Der vorher eingeworfene Betrag
    private String kraftstoff; // Welcher Kraftstoff wird an der Zapfsäule ausgegeben?
    /**
     * Konstruktor für Objekte der Klasse Tankaeule
     */
     public Tanksaeule(int preisproliter,String kraftStoffName)
    {
         preisProLiter = preisproliter;
         kraftstoff = kraftStoffName;
         getankteLiter = 0;
         getankteLiterGesamt = 0;
         betragGesamt = 0;
         geldBisherBezahlt = 0;

    }
    public void geldEinwerfen (int geldeingeworfen)
    {
        geldBisherBezahlt = geldeingeworfen;
    }
    public void preisAendern (int neuerPreis)
    {
        preisProLiter = neuerPreis;
    }
    public void tanken ()
    {
        getankteLiterGesamt;
    }
}
