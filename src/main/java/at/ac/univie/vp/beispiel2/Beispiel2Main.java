package at.ac.univie.vp.beispiel2;

public class Beispiel2Main {

    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad(8, 55);
        Person fahrradFahrer = new Person("Manu", null);
        fahrrad.reservieren(fahrradFahrer);
        System.out.println();
        System.out.println(fahrrad);

        LKW lkw = new LKW(8160, "W-LKW1", new Trailer(1370, 270));
        Person lkwFahrer = new Person("Obi", "C");
        lkw.reservieren(lkwFahrer);
        System.out.println();
        System.out.println(lkw);

        PKW pkw = new PKW(1500, "W-PKW1", 5);
        Person pkwFahrer = new Person("Merit", "B");
        pkw.reservieren(pkwFahrer);
        System.out.println();
        System.out.println(pkw);

        Moped moped = new Moped(200, "W-MOPED1");
        Person mopedFahrer = new Person("Eike", "A");
        moped.reservieren(mopedFahrer);
        System.out.println();
        System.out.println(moped);
    }
}
