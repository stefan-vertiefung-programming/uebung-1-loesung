package at.ac.univie.vp.beispiel2;

public class Moped extends Kraftfahrzeug {

    public Moped(int gewichtInKg, String kennzeichen) {
        super(gewichtInKg, kennzeichen);
    }

    @Override
    public String toString() {
        return "Moped{} (" + super.toString() + ")";
    }
}