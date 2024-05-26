package at.ac.univie.vp.beispiel2;

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
}
