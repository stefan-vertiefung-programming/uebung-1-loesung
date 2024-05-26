package at.ac.univie.vp.beispiel4;

public class Person {

    private final String name;
    private final String fuehrerSchein;
    private final Helm helm;

    public Person(String name, String fuehrerSchein, Helm helm) {
        this.name = name;
        this.fuehrerSchein = fuehrerSchein;
        this.helm = helm;
    }

    public String getName() {
        return name;
    }

    public String getFuehrerSchein() {
        return fuehrerSchein;
    }

    public Helm getHelm() {
        return helm;
    }

    @Override
    public String toString() {
        return "Fahrer{name='" + name + "', fuehrerSchein='" + fuehrerSchein + "', helm=" + helm + "}";
    }
}