package at.ac.univie.vp.beispiel4;

public class Moped extends Kraftfahrzeug implements Einspurig {

    public Moped(int gewichtInKg, String kennzeichen) {
        super(gewichtInKg, kennzeichen);
    }

    @Override
    public String toString() {
        return "Moped{} (" + super.toString() + ")";
    }

    @Override
    public boolean istPassenderHelm(Helm helm) {
        return Helm.MOTORRAD_HELM.equals(helm);
    }
}
