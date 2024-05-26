package at.ac.univie.vp.beispiel1;

public class Beispiel1Main {

    public static void main(String[] args) {
        Fahrad fahrad = new Fahrad("nummer1", 8, 55);

        Trailer trailer = new Trailer("W-1234", 1370, 270);
        LKW lkw = new LKW("nummer2", 8160, trailer);

        System.out.println();
        System.out.println(fahrad);

        System.out.println();
        System.out.println(trailer);
        System.out.println(lkw);
    }
}
