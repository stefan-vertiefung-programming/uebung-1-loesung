package at.ac.univie.vp.beispiel1;

public class Beispiel1Main {

    public static void main(String[] args) {
        Fahrad fahrad = new Fahrad(8, 55);
        System.out.println();
        System.out.println(fahrad);

        Trailer trailer = new Trailer(1370, 270);
        LKW lkw = new LKW(8160, "W-LKW1", trailer);
        System.out.println();
        System.out.println(lkw);

        PKW pkw = new PKW(1500, "W-PKW1", 5);
        System.out.println();
        System.out.println(pkw);

        Moped moped = new Moped(200, "W-MOPED1");
        System.out.println();
        System.out.println(moped);
    }
}
