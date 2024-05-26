package at.ac.univie.vp.beispiel1;

public class Fahrad extends Fahrzeug {

    private final int rahmengroesseInCm;

    public Fahrad(String fahrzeugNummer, int gewichtInKg, int rahmengroesseInCm) {
        super(fahrzeugNummer, gewichtInKg);
        this.rahmengroesseInCm = rahmengroesseInCm;
    }

    public int getRahmengroesseInCm() {
        return rahmengroesseInCm;
    }

    @Override
    public String toString() {
        return "Fahrad{rahmengroesseInCm=" + rahmengroesseInCm + "} (" + super.toString() + ")";
    }
}
