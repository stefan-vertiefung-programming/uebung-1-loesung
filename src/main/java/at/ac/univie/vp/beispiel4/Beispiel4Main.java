package at.ac.univie.vp.beispiel4;

public class Beispiel4Main {

    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad(8, 55);
        Person fahrradFahrer = new Person("Manu", null, Helm.FAHRRAD_HELM);
        System.out.println();
        System.out.println(fahrrad.istPassenderHelm(fahrradFahrer.getHelm()));

        Moped moped = new Moped(200, "W-MOPED1");
        Person mopedFahrer = new Person("Eike", "A", Helm.MOTORRAD_HELM);
        System.out.println();
        System.out.println(moped.istPassenderHelm(mopedFahrer.getHelm()));

        System.out.println(findeRichtigenHelm(fahrrad));
        System.out.println(findeRichtigenHelm(moped));
    }

    public static Helm findeRichtigenHelm(Einspurig einspurig) {
        for (Helm helm : Helm.values()) {
            if (einspurig.istPassenderHelm(helm)) {
                return helm;
            }
        }
        return null;
    }
}
