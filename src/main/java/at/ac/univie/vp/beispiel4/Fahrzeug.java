package at.ac.univie.vp.beispiel4;

public abstract class Fahrzeug implements Einspurig {

    private final int gewichtInKg;
    private Person person;

    public Fahrzeug(int gewichtInKg) {
        this.gewichtInKg = gewichtInKg;
    }

    public int getGewichtInKg() {
        return gewichtInKg;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Fahrzeug{gewichtInKg=" + gewichtInKg + ", person='" + person + "'}";
    }

    public abstract boolean kannReservieren(Person person);

    public final void reservieren(Person person) {
        if (!kannReservieren(person) || this.person != null) {
            System.err.println(person + " kann " + this + " nicht reservieren");
            return;
        }
        this.person = person;
    }
}
