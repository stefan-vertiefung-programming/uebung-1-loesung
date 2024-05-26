package at.ac.univie.vp.beispiel4;

public class Beispiel4Main {

    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad(8, 55);
        Person fahrradFahrer = new Person("Manu", null, Helm.FAHRRAD_HELM);
        System.out.println();
        System.out.println(fahrrad.hatPassendenHelm(fahrradFahrer));

        Moped moped = new Moped(200, "W-MOPED1");
        Person mopedFahrer = new Person("Eike", "A", Helm.MOTORRAD_HELM);
        System.out.println();
        System.out.println(moped.hatPassendenHelm(mopedFahrer));
    }
}
