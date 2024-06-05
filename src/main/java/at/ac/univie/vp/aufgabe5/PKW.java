package at.ac.univie.vp.aufgabe5;

public class PKW extends Kraftfahrzeug {

    private final int anzahlSitze;

    public PKW(int gewichtInKg, String kennzeichen, int anzahlSitze) {
        super(gewichtInKg, kennzeichen);
        this.anzahlSitze = anzahlSitze;
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    @Override
    public String toString() {
        return "PKW{anzahlSitze=" + anzahlSitze + "} (" + super.toString() + ")";
    }

    @Override
    public boolean kannReservieren(Person person) {
        return "B".equals(person.getFuehrerSchein());
    }
}
