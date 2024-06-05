package at.ac.univie.vp.aufgabe4;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + anzahlSitze;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof PKW)) {
            return false;
        }
        PKW other = (PKW) obj;
        if (anzahlSitze != other.anzahlSitze) {
            return false;
        }
        return true;
    }
}
