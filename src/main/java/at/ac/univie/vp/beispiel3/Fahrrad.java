package at.ac.univie.vp.beispiel3;

public class Fahrrad extends Fahrzeug {

    private final int rahmengroesseInCm;

    public Fahrrad(int gewichtInKg, int rahmengroesseInCm) {
        super(gewichtInKg);
        this.rahmengroesseInCm = rahmengroesseInCm;
    }

    public int getRahmengroesseInCm() {
        return rahmengroesseInCm;
    }

    @Override
    public String toString() {
        return "Fahrad{rahmengroesseInCm=" + rahmengroesseInCm + "} (" + super.toString() + ")";
    }

    @Override
    public boolean kannReservieren(Person person) {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Fahrrad)) {
            return false;
        }
        Fahrrad other = (Fahrrad) obj;
        if (rahmengroesseInCm != other.rahmengroesseInCm) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + rahmengroesseInCm;
        return result;
    }
}
