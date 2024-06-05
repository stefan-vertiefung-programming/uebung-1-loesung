package at.ac.univie.vp.aufgabe4;

public class Person {

    private final String name;
    private final String fuehrerSchein;

    public Person(String name, String fuehrerSchein) {
        this.name = name;
        this.fuehrerSchein = fuehrerSchein;
    }

    public String getName() {
        return name;
    }

    public String getFuehrerSchein() {
        return fuehrerSchein;
    }

    @Override
    public String toString() {
        return "Fahrer{name='" + name + "', fuehrerSchein='" + fuehrerSchein + "'}";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (fuehrerSchein == null) {
            if (other.fuehrerSchein != null) {
                return false;
            }
        } else if (!fuehrerSchein.equals(other.fuehrerSchein)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (name == null) {
            result = prime * result;
        } else {
            result = prime * result + name.hashCode();
        }
        if (fuehrerSchein == null) {
            result = prime * result;
        } else {
            result = prime * result + fuehrerSchein.hashCode();
        }
        return result;
    }
}
