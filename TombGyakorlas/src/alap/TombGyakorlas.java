package alap;

import java.util.Random;
import java.util.Scanner;

public class TombGyakorlas {
    private static final Scanner SCR = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        boolean jo;
        int betuDb;
        
        do {            
            System.out.println("Hány betű? (1...10): ");
            betuDb = SCR.nextInt();
            jo = betuDb >= 1 && betuDb <= 10;
        } while (!jo);

        char[] betuk = new char[betuDb];

        for (int i = 0; i < betuDb; i++) {
            betuk[i] = randomGeneralas();
        }

        System.out.println("A generált véletlenszerű betűk:");
        for (char betu : betuk) {
            System.out.print(betu + " ");
        }
    }

    public static char randomGeneralas() {
        int randomInt = RANDOM.nextInt(58) + 65;
        if (randomInt > 90 && randomInt < 97) {
            randomInt = RANDOM.nextInt(58) + 65;
        }
        return (char) randomInt;
    }
}
