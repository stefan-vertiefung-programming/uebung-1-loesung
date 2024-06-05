package at.ac.univie.vp.aufgabe4;

public class LKW extends Kraftfahrzeug {

    private final Trailer trailer;

    public LKW(int gewichtInKg, String kennzeichen, Trailer trailer) {
        super(gewichtInKg, kennzeichen);
        this.trailer = trailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    @Override
    public String toString() {
        return "LKW{trailer=" + trailer + "} (" + super.toString() + ")";
    }

    @Override
    public boolean kannReservieren(Person person) {
        return "C".equals(person.getFuehrerSchein());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof LKW)) {
            return false;
        }
        LKW other = (LKW) obj;
        if (trailer == null) {
            if (other.trailer != null) {
                return false;
            }
        } else if (!trailer.equals(other.trailer)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        if (trailer == null) {
            result = prime * result;
        } else {
            result = prime * result + trailer.hashCode();
        }
        return result;
    }
}
