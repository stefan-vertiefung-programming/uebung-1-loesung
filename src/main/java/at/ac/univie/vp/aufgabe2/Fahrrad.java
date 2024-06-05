package at.ac.univie.vp.aufgabe2;

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
}
