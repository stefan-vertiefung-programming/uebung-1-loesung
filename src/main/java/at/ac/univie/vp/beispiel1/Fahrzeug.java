package at.ac.univie.vp.beispiel1;

public abstract class Fahrzeug {

    private final int gewichtInKg;

    public Fahrzeug(int gewichtInKg) {
        this.gewichtInKg = gewichtInKg;
    }

    public int getGewichtInKg() {
        return gewichtInKg;
    }

    @Override
    public String toString() {
        return "Fahrzeug{gewichtInKg=" + gewichtInKg + "}";
    }
}
