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
    public static final int mindestAbhanmeMenge = 5;
    public int preisProLiter; // Der Preis pro Liter Kraftstoff,
    private int getankteLiter; // Die Anzahl der getankten Liter für das eingeworfene Geld (geldBisherBezahlt)
    private int getankteLiterGesamt; // Die gesamten ausgegebenen Liter 
    private int betragGesamt; // Der gesamte eingenommene Betrag
    private int geldBisherBezahlt; // Der vorher eingeworfene Betrag
    private String kraftstoff; // Welcher Kraftstoff wird an der Zapfsäule ausgegeben?
    /**
     * Konstruktor für Objekte der Klasse Tankaeule
     */
     public Tanksaeule(int preisProLiter,String kraftStoffName)
    {
         this.preisProLiter = preisProLiter;
         this.kraftstoff = kraftStoffName;
         this.getankteLiter = 0;
         this.getankteLiterGesamt = 0;
         this.betragGesamt = 0;
         this.geldBisherBezahlt = 0;

    }
    public void geldEinwerfen (int geldeingeworfen)
    {
        this.geldBisherBezahlt = geldeingeworfen;
    }
    //kein explizieter setter benoetigt, weil nix gerechnet wird. methode kann auch direkt public deklariert werden 
    /*public void preisAendern (int neuerPreis) 
    {
        this.preisProLiter = neuerPreis;
    }*/
    
    public void tanken () throws Exception
    {
        if(this.geldBisherBezahlt * this.preisProLiter < Tanksaeule.mindestAbhanmeMenge)
        {
            throw new Exception("Sie muessen min. 5 Liter tanken");
        }
        this.getankteLiter = this.preisProLiter * this.geldBisherBezahlt;
        this.getankteLiterGesamt += this.getankteLiter;
        this.betragGesamt += this.geldBisherBezahlt;
        this.geldBisherBezahlt = 0;
    }
}
