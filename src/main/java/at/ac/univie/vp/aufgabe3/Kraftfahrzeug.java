package at.ac.univie.vp.aufgabe3;

public abstract class Kraftfahrzeug extends Fahrzeug {

    private final String kennzeichen;

    public Kraftfahrzeug(int gewichtInKg, String kennzeichen) {
        super(gewichtInKg);
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public String toString() {
        return "Kraftfahrzeug{kennzeichen='" + kennzeichen + "'} (" + super.toString() + ")";
    }

    @Override
    public boolean kannReservieren(Person person) {
        return person.getFuehrerSchein() != null;
    }
}
