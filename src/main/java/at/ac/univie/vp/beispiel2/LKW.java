package at.ac.univie.vp.beispiel2;

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
}
