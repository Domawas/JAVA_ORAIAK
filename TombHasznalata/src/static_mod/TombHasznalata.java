package static_mod;

import java.util.Random;

public class TombHasznalata {

    private static final Random random = new Random();

    private static String[] nevek;

    public static void main(String[] args) {
        int[] egeszek = {10, 20, 30};

        Valtozas(egeszek);

        kiirTomb("int[] tomb1 = {10,20,30}: ", egeszek);
        int valtozasSzama = 0;
        while (!(egeszek[0] == 40)) {
            Valtozas(egeszek);
            valtozasSzama++;
        }
        kiirTomb("---[0] = 40: ", egeszek);

        nevek = new String[3];
        nevek[0] = "Ede";
        nevek[1] = "Éva";
        nevek[2] = "Pál";
        nevStatisztika();

    }

    private static void Valtozas(int[] tomb) {

        int index = random.nextInt(tomb.length);
        tomb[index] = tomb[index] * -2;
        System.out.println("A(z) " + index + ". indexű elem változott: " + tomb[index]);

    }

    private static void kiirTomb(String cim, int[] tomb) {
        System.out.println(cim);
        int db = tomb.length;
        for (int i = 0; i < db; i++) {
            System.out.printf("[%d] = %d\n", i, tomb[i]);
        }
    }



    private static void nevStatisztika() {
        for (int i = 0; i < nevek.length; i++) {
            String nev = nevek[i];
            int db = nev.length();
            boolean van
        }
    }
    
    
}
