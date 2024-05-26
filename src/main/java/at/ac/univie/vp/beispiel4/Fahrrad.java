package at.ac.univie.vp.beispiel4;

public class Fahrrad extends Fahrzeug implements Einspurig {

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
    public boolean hatPassendenHelm(Person person) {
        return Helm.FAHRRAD_HELM.equals(person.getHelm());
    }
}
