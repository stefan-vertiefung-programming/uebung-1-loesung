package at.ac.univie.vp.aufgabe3;

public class Trailer {

    private final int laengeInCm;
    private final int hoeheInCm;

    public Trailer(int laengeInCm, int hoeheInCm) {
        this.laengeInCm = laengeInCm;
        this.hoeheInCm = hoeheInCm;
    }

    public int getLaengeInCm() {
        return laengeInCm;
    }

    public int getHoeheInCm() {
        return hoeheInCm;
    }

    @Override
    public String toString() {
        return "Trailer{laengeInCm=" + laengeInCm + ", hoeheInCm=" + hoeheInCm + "}";
    }
}
