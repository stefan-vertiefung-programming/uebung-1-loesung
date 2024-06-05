package at.ac.univie.vp.aufgabe4;

public abstract class Kraftfahrzeug extends Fahrzeug {

    private final String kennzeichen;

    public Kraftfahrzeug(int gewichtInKg, String kennzeichen) {
        super(gewichtInKg);
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public String toString() {
        return "Kraftfahrzeug{kennzeichen='" + kennzeichen + "'} (" + super.toString() + ")";
    }

    @Override
    public boolean kannReservieren(Person person) {
        return person.getFuehrerSchein() != null;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Kraftfahrzeug)) {
            return false;
        }
        Kraftfahrzeug other = (Kraftfahrzeug) obj;
        if (kennzeichen == null) {
            if (other.kennzeichen != null) {
                return false;
            }
        } else if (!kennzeichen.equals(other.kennzeichen)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        if (kennzeichen == null) {
            result = prime * result;
        } else {
            result = prime * result + kennzeichen.hashCode();
        }
        return result;
    }
}
