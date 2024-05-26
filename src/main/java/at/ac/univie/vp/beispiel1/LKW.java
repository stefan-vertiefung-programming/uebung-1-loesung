package at.ac.univie.vp.beispiel1;

public class LKW extends Kraftfahrzeug {

    private final Trailer trailer;

    public LKW(String fahrzeugNummer, int gewicht, Trailer trailer) {
        super(fahrzeugNummer, gewicht);
        this.trailer = trailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    @Override
    public String toString() {
        return "LKW{trailer=" + trailer + "} (" + super.toString() + ")";
    }
}
