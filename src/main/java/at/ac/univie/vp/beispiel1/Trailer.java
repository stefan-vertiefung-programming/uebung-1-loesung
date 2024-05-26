package at.ac.univie.vp.beispiel1;

public class Trailer {

    private final String kennzeichen;
    private final int laengeInCm;
    private final int hoeheInCm;

    public Trailer(String kennzeichen, int laengeInCm, int hoeheInCm) {
        this.kennzeichen = kennzeichen;
        this.laengeInCm = laengeInCm;
        this.hoeheInCm = hoeheInCm;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getLaengeInCm() {
        return laengeInCm;
    }

    public int getHoeheInCm() {
        return hoeheInCm;
    }

    @Override
    public String toString() {
        return "Trailer{kennzeichen='" + kennzeichen + "', laengeInCm=" + laengeInCm + ", hoeheInCm=" + hoeheInCm + "}";
    }
}
