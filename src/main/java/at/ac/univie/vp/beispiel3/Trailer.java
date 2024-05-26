package at.ac.univie.vp.beispiel3;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + laengeInCm;
        result = prime * result + hoeheInCm;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Trailer)) {
            return false;
        }
        Trailer other = (Trailer) obj;
        if (laengeInCm != other.laengeInCm) {
            return false;
        }
        if (hoeheInCm != other.hoeheInCm) {
            return false;
        }
        return true;
    }
}
