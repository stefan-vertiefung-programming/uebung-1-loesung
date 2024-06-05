package at.ac.univie.vp.aufgabe4;

public class Aufgabe4Main {

    public static void main(String[] args) {
        Fahrrad fahrrad1 = new Fahrrad(8, 55);
        Fahrrad fahrrad2 = new Fahrrad(8, 55);
        Fahrrad fahrrad3 = new Fahrrad(10, 55);
        Person fahradFahrer = new Person("Manu", null);
        fahrrad1.reservieren(fahradFahrer);
        fahrrad2.reservieren(fahradFahrer);
        fahrrad3.reservieren(fahradFahrer);
        System.out.println();
        System.out.println(fahrrad1.equals(fahrrad2));
        System.out.println(fahrrad1.equals(fahrrad3));
        System.out.println(fahrrad1.hashCode());
        System.out.println(fahrrad2.hashCode());
        System.out.println(fahrrad3.hashCode());

        LKW lkw1 = new LKW(8160, "W-LKW1", new Trailer(1370, 270));
        LKW lkw2 = new LKW(8160, "W-LKW1", new Trailer(1370, 270));
        LKW lkw3 = new LKW(8160, "W-LKW2", new Trailer(1370, 270));
        Person lkwFahrer = new Person("Obi", "C");
        lkw1.reservieren(lkwFahrer);
        lkw2.reservieren(lkwFahrer);
        lkw3.reservieren(lkwFahrer);
        System.out.println();
        System.out.println(lkw1.equals(lkw2));
        System.out.println(lkw1.equals(lkw3));
        System.out.println(lkw1.hashCode());
        System.out.println(lkw2.hashCode());
        System.out.println(lkw3.hashCode());

        PKW pkw1 = new PKW(1500, "W-PKW1", 5);
        PKW pkw2 = new PKW(1500, "W-PKW1", 5);
        PKW pkw3 = new PKW(1500, "W-PKW2", 5);
        Person pkwFahrer = new Person("Merit", "B");
        pkw1.reservieren(pkwFahrer);
        pkw2.reservieren(pkwFahrer);
        pkw3.reservieren(pkwFahrer);
        System.out.println();
        System.out.println(pkw1.equals(pkw2));
        System.out.println(pkw1.equals(pkw3));
        System.out.println(pkw1.hashCode());
        System.out.println(pkw2.hashCode());
        System.out.println(pkw3.hashCode());

        Moped moped1 = new Moped(200, "W-MOPED1");
        Moped moped2 = new Moped(200, "W-MOPED1");
        Moped moped3 = new Moped(200, "W-MOPED2");
        Person mopedFahrer = new Person("Eike", "A");
        moped1.reservieren(mopedFahrer);
        moped2.reservieren(mopedFahrer);
        moped3.reservieren(mopedFahrer);
        System.out.println();
        System.out.println(moped1.equals(moped2));
        System.out.println(moped1.equals(moped3));
        System.out.println(moped1.hashCode());
        System.out.println(moped2.hashCode());
        System.out.println(moped3.hashCode());
    }
}
