package main;

import java.util.Random;

public class Eldontes {

    public static void main(String[] args) {
        int[] szamok = tombKeszites(12);
        tombKiir(szamok);
        vegzodo(szamok, 3);
    }

    private static int[] tombKeszites(int meret) {
        Random rnd = new Random();
        int[] szamok = new int[meret];

        for (int i = 0; i < meret; i++) {
            szamok[i] = rnd.nextInt(15);
        }

        return szamok;
    }

    private static void tombKiir(int[] szamok) {
        int meret = szamok.length;
        for (int i = 0; i < meret; i++) {
            System.out.print(szamok[i] + " ");
        }
    }

    private static void vegzodo(int[] szamok, int veg) {
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] <= veg) {
                System.out.println(szamok[i] + " ");
            }
        }
    }
}
