package at.ac.univie.vp.beispiel1;

public abstract class Kraftfahrzeug extends Fahrzeug {

    public Kraftfahrzeug(String fahrzeugNummer, int gewichtInKg) {
        super(fahrzeugNummer, gewichtInKg);
    }

    @Override
    public String toString() {
        return "Kraftfahrzeug{} (" + super.toString() + ")";
    }
}
