package main;

import java.util.Random;

public class Jatek {

    /*osztály adattagjai*/
    private static final Random RANDOM = new Random(); 
    public static final int MIN = 1;
    public static final int MAX = 10;
    
    /*objektum adattagjai*/
    /*Adatrejtés: private*/
    private Jatekos j1, j2, j3;
    private int szam;

    public Jatek() {
        j1 = new Jatekos();
        j2 = new Jatekos();
        j3 = new Jatekos();
        szam = RANDOM.nextInt(MIN, MAX);

    }

    public void start() {
        System.out.println("Gondoltam egy számra 1 és 9 között...");
        System.out.printf("A gondolt szám: %d\n", szam);

        int tipp1, tipp2, tipp3;
        boolean vanNyertes;
        do {
//            j1.tippel();
//            j2.tippel();
//            j3.tippel();
            tipp1 = j1.getTipp();
            tipp2 = j2.getTipp();
            tipp3 = j3.getTipp();

            System.out.println("1. játékos helyes tipp: " + tipp1);
            System.out.println("2. játékos helyes tipp: " + tipp2);
            System.out.println("3. játékos helyes tipp: " + tipp3);
            vanNyertes = tipp1 == szam || tipp2 == szam || tipp3 == szam;
            if (!vanNyertes) {
                System.out.println("a játékosok újra próbálkoznak");
                System.out.println("A kitalálandó szám: " + szam);
            }

        } while (!vanNyertes);

        if (j1.getTipp() == szam || j2.getTipp() == szam || j3.getTipp() == szam) {
            System.out.println("Van nyertes!");
        } else {
            System.out.println("A játékosok újrapróbálkoznak.");
        }
    }
}
