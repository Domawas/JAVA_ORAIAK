
package main;

import java.util.Random;
import java.util.Scanner;


public class TombKocka {
    
    private static final Scanner SRC = new Scanner(System.in);
    private static final Random RND = new Random();

    
    public static void main(String[] args) {
        System.out.println("hányszor dobunk:");
        int dobasokSzama = SRC.nextInt();
        int[] dobasok = new int[7];
        for (int i = 0; i < dobasokSzama; i++) {
            int dobas = RND.nextInt(1,7);
            dobasok[dobas]++;
        }
        
        
        System.out.println("dobás statisztika:");
        System.out.printf("%d dobásból: \n", dobasokSzama);
        for (int i = 1; i < dobasok.length; i++) {
            int ertek = dobasok[i];
            System.out.printf("%d volt: %d\n", i, ertek);
        }
        System.out.println("------------");
        int i = 0;
        for (int ertek : dobasok) {
            if (i!=0) {
                
                System.out.printf("%d volt: %d\n", i, ertek);
            }
            i++;
        }
  
    }
    

}

