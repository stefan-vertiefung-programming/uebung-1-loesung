package at.ac.univie.vp.aufgabe5;

public class Aufgabe5Main {

    public static void main(String[] args) {
        Fahrrad fahrrad1 = new Fahrrad(8, 55);
        Fahrrad fahrrad2 = new Fahrrad(7, 55);
        System.out.println();
        System.out.println(fahrrad1.istPassenderHelm("FAHRRAD_HELM"));

        Moped moped1 = new Moped(200, "W-MOPED1");
        Moped moped2 = new Moped(150, "W-MOPED2");
        System.out.println();
        System.out.println(moped1.istPassenderHelm("MOTORRAD_HELM"));

        System.out.println();
        System.out.println(helmPasstFuerBeide("FAHRRAD_HELM", fahrrad1, moped1));
        System.out.println(helmPasstFuerBeide("FAHRRAD_HELM", fahrrad1, fahrrad2));
        System.out.println(helmPasstFuerBeide("MOTORRAD_HELM", moped1, moped2));
    }

    public static boolean helmPasstFuerBeide(String helm, Einspurig einspurig1, Einspurig einspurig2) {
        if (einspurig1 == null || einspurig2 == null) {
            return false;
        }
        return einspurig1.istPassenderHelm(helm) && einspurig2.istPassenderHelm(helm);
    }
}
