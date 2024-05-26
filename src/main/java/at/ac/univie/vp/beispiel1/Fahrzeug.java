package at.ac.univie.vp.beispiel1;

public abstract class Fahrzeug {

    private final String fahrzeugNummer;
    private final int gewichtInKg;

    public Fahrzeug(String fahrzeugNummer, int gewichtInKg) {
        this.fahrzeugNummer = fahrzeugNummer;
        this.gewichtInKg = gewichtInKg;
    }

    public String getFahrzeugNummer() {
        return fahrzeugNummer;
    }

    public int getGewichtInKg() {
        return gewichtInKg;
    }

    @Override
    public String toString() {
        return "Fahrzeug{fahrzeugNummer='" + fahrzeugNummer + "', gewichtInKg=" + gewichtInKg + "}";
    }
}
