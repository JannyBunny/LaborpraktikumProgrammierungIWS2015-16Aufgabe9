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
     * Zunaechst wird die Zapfsaeule kreirt, welche die Werte für den Preis pro Liter und den Kraftstoff benötigt.
     * Die restlichen Werte werden mit 0 initialisiert.
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
    /**
     * Mit der Methode "geldEinwerfen" wird der Einwurf des Geldes in die Zapfsaeule abgegbildet.
     * Dort kann nun Geld eingworfen werden.
     * Es wird ausserdem geprüft, ob das eingeworfene Geld plausibel ist.
     */
    public void geldEinwerfen (int geldeingeworfen)
    {
      if (geldeingeworfen >= 0) {
          geldBisherBezahlt = geldeingeworfen;
      }
      else
      {
          System.err.println("Bitte nur positive Geldbeträge einwerfen!");
      }  
    }
    /**
     * Mit der Methode "preisAendern" kann der initial festgelegte Preis pro Liter angepasst werden.
     * Es wird auch überprüft, ob noch ein Tankvorgang laeuft.
     */
    public void preisAendern (int neuerPreis)
    {
      if (geldBisherBezahlt == 0) {
          preisProLiter = neuerPreis;
      }   
      else {
          System.err.println("Es existiert zurzeit noch ein Tankvorgang, bitte etwas Warten!");
      }
    }
    /**
     * Der Tankvorgang wird mit der Methode "tanken" ausgeführt.
     * Dafür wird zunächst geprüft, ob Geld eingeworfen wurde, wenn dieses der Fall ist, werden zunächst die Liter die getankt werden können ausgerechnet, indem der bisher gezahlte Betrag durch den Preis Pro Liter 
     */
    public void tanken ()
    {
      if (geldBisherBezahlt > 0) {
        getankteLiter = geldBisherBezahlt / preisProLiter;
        getankteLiterGesamt = getankteLiterGesamt + getankteLiter;
        betragGesamt = betragGesamt + geldBisherBezahlt;
        System.out.println("An dieser Zapfsaeule kann " + kraftstoff + " in L fuer " + preisProLiter + " Cent getankt werden");
        System.out.println("Quittung:");
        System.out.println("Geld bezahlt: " + geldBisherBezahlt );
        System.out.println("Getankte Liter: " + getankteLiter + " " + kraftstoff );
        geldBisherBezahlt = 0;
        getankteLiter = 0;
    }
    else {
        System.err.println("Bitte zunächst Geld einwerfen!");
    }
    }
    /**
     * Mit der Methode gibGesamtEingenommen wird das Gesamt eingenommene Geld abgefragt werden.
     */
    public int gibGesamtEingenommen ()
    {
        return betragGesamt;
    }
    /**
     * Mit der Methode gibLiterGesamt wird das gesamt vertankte Benzin in Litern ausgegeben.
     */
    public int gibLiterGesamt ()
    {
        return getankteLiterGesamt;
    }
    }
