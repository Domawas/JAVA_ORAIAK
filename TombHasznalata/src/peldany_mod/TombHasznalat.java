package peldany_mod;

import static java.lang.Math.random;
import java.util.Random;

public class TombHasznalat {

    private static final Random random = new Random();

    public static void main(String[] args) {

        int[] egeszek = {10, 20, 30};
        TombHasznalat prg = new TombHasznalat();
        new TombHasznalat().Valtozas(egeszek);

        prg.kiirTomb("int[] tomb1 = {10,20,30}: ", egeszek);
        int valtozasSzama = 0;
        while (!(egeszek[0] == 40)) {
            prg.Valtozas(egeszek);
            valtozasSzama++;
        }
        prg.kiirTomb("---[0] = 40: ", egeszek);

        prg.nevek = new String[3];
        prg.nevek[0] = "Ede";
        prg.nevek[1] = "Éva";
        prg.nevek[2] = "Pál";
        prg.nevStatisztika();

    }
    private String[] nevek;

    private void kiirTomb(String cim, int[] tomb) {
        System.out.println(cim);
        int db = tomb.length;
        for (int i = 0; i < db; i++) {
            System.out.printf("[%d] = %d\n", i, tomb[i]);
        }
    }

    private void Valtozas(int[] tomb) {

        int index = random.nextInt(tomb.length);
        tomb[index] = tomb[index] * -2;
        System.out.println("A(z) " + index + ". indexű elem változott: " + tomb[index]);

    }

    private void nevStatisztika() {
        for (int i = 0; i < nevek.length; i++) {
            String nev = nevek[i];
            int db = nev.length();
            boolean van
        }
    }
}
