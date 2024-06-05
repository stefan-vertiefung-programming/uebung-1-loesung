package at.ac.univie.vp.aufgabe4;

public abstract class Fahrzeug {

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Fahrzeug)) {
            return false;
        }
        Fahrzeug other = (Fahrzeug) obj;
        if (gewichtInKg != other.gewichtInKg) {
            return false;
        }
        if (person == null) {
            if (other.person != null) {
                return false;
            }
        } else if (!person.equals(other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + gewichtInKg;
        if (person == null) {
            result = prime * result;
        } else {
            result = prime * result + person.hashCode();
        }
        return result;
    }
}
