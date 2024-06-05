package at.ac.univie.vp.aufgabe5;

public class Moped extends Kraftfahrzeug implements Einspurig {

    public Moped(int gewichtInKg, String kennzeichen) {
        super(gewichtInKg, kennzeichen);
    }

    @Override
    public String toString() {
        return "Moped{} (" + super.toString() + ")";
    }

    @Override
    public boolean istPassenderHelm(String helm) {
        return "MOTORRAD_HELM".equals(helm);
    }
}
